package vn.stu.quanlydiem.Responsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.stu.quanlydiem.Model.SinhVien;

public interface HocvienRepository extends JpaRepository<SinhVien, Integer> {

}