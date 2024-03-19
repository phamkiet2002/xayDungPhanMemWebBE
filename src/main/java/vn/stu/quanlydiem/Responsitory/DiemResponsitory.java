package vn.stu.quanlydiem.Responsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.stu.quanlydiem.Model.Diem;

public interface DiemResponsitory extends JpaRepository<Diem,Long> {
}
