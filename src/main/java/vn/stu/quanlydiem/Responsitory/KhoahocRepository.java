package vn.stu.quanlydiem.Responsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.stu.quanlydiem.Model.Monhoc;
@Repository
public interface KhoahocRepository extends JpaRepository<Monhoc, Integer> {
}