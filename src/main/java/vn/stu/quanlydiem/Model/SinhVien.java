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
@Table(name = "hocvien")
public class SinhVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "masinhvien", nullable = false)
    private Integer idsinhvien;

    @Size(max = 255)
    @NotNull
    @Column(name = "ten", nullable = false)
    private String ten;

    @Size(max = 255)
    @NotNull
    @Column(name = "email", nullable = false)
    private String email;

    @Size(max = 20)
    @NotNull
    @Column(name = "so_dien_thoai", nullable = false, length = 20)
    private String soDienThoai;

    @Lob
    @Column(name = "dia_chi")
    private String diaChi;

    @ManyToOne
    @JoinColumn(name = "malop")
    private Lophoc lophoc;







}