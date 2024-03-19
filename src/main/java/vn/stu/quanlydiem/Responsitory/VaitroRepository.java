package vn.stu.quanlydiem.Responsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.stu.quanlydiem.Model.Vaitro;
@Repository
public interface VaitroRepository extends JpaRepository<Vaitro, Integer> {
}