package vn.stu.quanlydiem.Responsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import vn.stu.quanlydiem.Model.Diem;
import vn.stu.quanlydiem.Model.Monhoc;
import vn.stu.quanlydiem.Model.SinhVien;

import java.util.Optional;

public interface DiemResponsitory extends JpaRepository<Diem,Long> {
    Optional<Diem> findBySinhVienAndMonhoc(SinhVien sv, Monhoc mh);
    

}
