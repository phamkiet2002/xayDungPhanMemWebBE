package vn.stu.quanlydiem.Responsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.stu.quanlydiem.Model.Nguoidung;
@Repository
public interface NguoidungRepository extends JpaRepository<Nguoidung, Integer> {
}