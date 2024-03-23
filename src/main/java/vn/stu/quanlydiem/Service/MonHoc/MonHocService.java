package vn.stu.quanlydiem.Service.MonHoc;

import vn.stu.quanlydiem.Model.Monhoc;
import vn.stu.quanlydiem.Model.SinhVien;

import java.util.List;
import java.util.Optional;

public interface MonHocService {

    List<Monhoc> getAll();

    Monhoc  save(Monhoc monhoc);

    Optional<Monhoc> findById(Integer integer);

    void deleteById(Integer integer);

    Monhoc updateMonHoc(Integer id, Monhoc monhoc);
}
