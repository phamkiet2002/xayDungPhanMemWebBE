package vn.stu.quanlydiem.Responsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.stu.quanlydiem.Model.Quyen;
@Repository
public interface QuyenRepository extends JpaRepository<Quyen, Integer> {
}