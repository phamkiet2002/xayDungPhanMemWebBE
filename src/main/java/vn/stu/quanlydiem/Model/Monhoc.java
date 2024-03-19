package vn.stu.quanlydiem.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "monhoc")
public class Monhoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maMH", nullable = false)
    private Integer idMH;

    @Size(max = 50)
    @NotNull
    @Column(name = "tenMH", nullable = false, length = 50)
    private String tenMH;

    @Column(name = "soTc")
    private String soTc;


}