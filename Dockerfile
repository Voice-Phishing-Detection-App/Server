# jdk 11환경 구성
FROM openjdk:11-jre-slim-buster

# 패키지 업데이트 및 업그레이드, FFmpeg 설치 후 캐시 삭제
RUN apt-get update && apt-get upgrade -y \
    && apt-get install -y ffmpeg \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*

ARG JAR_FILE=build/libs/*.jar
# jar 파일을 app.jar로 복사
COPY ${JAR_FILE} app.jar

# 환경변수 설정

EXPOSE 8080

COPY src/main/resources/fcm-service-account-file.json src/main/resources/fcm-service-account-file.json
COPY src/main/resources/google_stt_account_key.json src/main/resources/google_stt_account_key.json
ENV GOOGLE_APPLICATION_CREDENTIALS=/src/main/resources/google_stt_account_key.json

# jar 파일 실행
ENTRYPOINT ["java","-jar","/app.jar"]
