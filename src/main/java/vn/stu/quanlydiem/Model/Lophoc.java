package vn.stu.quanlydiem.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "lophoc")
public class Lophoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "malop", nullable = false)
    private Integer malop;

    @Column(name = "tenlop", length = 50)
    private String tenlop;


}
