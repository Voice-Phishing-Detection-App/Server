package PhishingUniv.Phinocchio.Center.entity;

import javax.persistence.*;

@Entity
@Table(name = "center")
public class CenterEntity {
    @Id
    @Column(name = "center_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long center_id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "phone)number", nullable = false, length = 20)
    private String phone_number;

}