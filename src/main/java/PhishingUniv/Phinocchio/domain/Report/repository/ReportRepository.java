package PhishingUniv.Phinocchio.domain.Report.repository;

import PhishingUniv.Phinocchio.domain.Report.entity.ReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ReportRepository extends JpaRepository<ReportEntity, Long> {
    Optional<ReportEntity> findByUserId(Long id);
    List<ReportEntity> findReportEntitiesByUserId(Long userid);


    List<ReportEntity> findReportEntitiesByPhoneNumber(String phoneNumber);
    Long countByPhoneNumber(String phoneNumber);
}
