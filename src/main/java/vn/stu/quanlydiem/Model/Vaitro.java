package vn.stu.quanlydiem.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.LinkedHashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "vaitro")
public class Vaitro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_vai_tro", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "ten_vai_tro", nullable = false)
    private String tenVaiTro;

    @OneToMany(mappedBy = "maVaiTro")
    private Set<Nguoidung> nguoidungs = new LinkedHashSet<>();

    @OneToMany(mappedBy = "maVaiTro")
    private Set<Quyen> quyens = new LinkedHashSet<>();

}