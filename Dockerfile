# jdk 11환경 구성
FROM openjdk:11-jre-slim-buster

# 패키지 업데이트 및 업그레이드
RUN apt-get update && apt-get upgrade -y
ARG JAR_FILE=build/libs/*.jar
# jar 파일을 app.jar로 복사
COPY ${JAR_FILE} app.jar
EXPOSE 8080

# jar 파일 실행
ENTRYPOINT ["java","-jar","/app.jar"]