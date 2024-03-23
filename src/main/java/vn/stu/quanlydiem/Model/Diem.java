package vn.stu.quanlydiem.Model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "diem")
public class Diem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "idsinhvien")
    private SinhVien sinhVien;

    @ManyToOne
    @JoinColumn(name = "idMH")
    private Monhoc monhoc;

    @Column(name = "diem")
    private Float diem;

    String danhgia() {
        if (diem > 0 && diem <= 5) {
            return "hoc lai";
        } else if (diem >= 5 && diem < 8) {
            return "kha";
        } else {
            return "Gioi";
        }
    }
}
