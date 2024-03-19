package vn.stu.quanlydiem.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "nguoidung")
public class Nguoidung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_nguoi_dung", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "ten_dang_nhap", nullable = false)
    private String tenDangNhap;

    @Size(max = 255)
    @NotNull
    @Column(name = "mat_khau", nullable = false)
    private String matKhau;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_vai_tro")
    private Vaitro maVaiTro;

}