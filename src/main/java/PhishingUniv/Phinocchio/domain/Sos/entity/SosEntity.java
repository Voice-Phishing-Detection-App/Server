package PhishingUniv.Phinocchio.domain.Sos.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "sos")
@Getter
@Setter
public class SosEntity {

    @Id
    @Column(name = "sos_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sosId;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "phone_number", nullable = false, length = 20)
    private String phoneNumber;

    @Column(name = "relation", nullable = false, length = 50)
    private String relation;

    @Column(name = "level", nullable = false)
    private int level;

}
