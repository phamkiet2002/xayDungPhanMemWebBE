package vn.stu.quanlydiem.Responsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.stu.quanlydiem.Model.Monhoc;

public interface MonHocRepository extends JpaRepository<Monhoc, Integer> {
    Monhoc findByIdMH(Integer id);
}
