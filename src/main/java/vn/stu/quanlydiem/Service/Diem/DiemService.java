package vn.stu.quanlydiem.Service.Diem;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import vn.stu.quanlydiem.Model.Diem;

import java.util.List;
import java.util.Optional;


public interface DiemService {
    List<Diem> findAll();

    Optional<Diem> findById(Long aLong);

    void deleteById(Long aLong);

    Diem save(Diem entity);

    Diem updateDiem(Long id, Diem diem);
}
