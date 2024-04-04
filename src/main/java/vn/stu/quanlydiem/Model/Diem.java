package vn.stu.quanlydiem.Model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;

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
    @Column(name = "id", nullable = false)
    Long id;

    @ManyToOne
    @JoinColumn(name = "idsinhvien")
//    @JoinColumn(name = "masinhvien")
    private SinhVien sinhVien;

    @ManyToOne
    @JoinColumn(name = "idMH")
//    @JoinColumn(name = "mamh")
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
