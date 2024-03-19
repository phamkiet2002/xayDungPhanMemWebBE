package vn.stu.quanlydiem.Service.Lophoc;

import vn.stu.quanlydiem.Model.Lophoc;

import java.util.List;
import java.util.Optional;

public interface LophocService {
    List<Lophoc> getAllLopHoc();
    Lophoc save(Lophoc lophoc);

    Optional<Lophoc> findById(Integer integer);

    void deleteById(Integer integer);

    Lophoc updateCategory(Integer LopId, Lophoc lophoc);
}
