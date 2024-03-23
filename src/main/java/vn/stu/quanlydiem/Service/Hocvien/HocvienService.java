package vn.stu.quanlydiem.Service.Hocvien;

import vn.stu.quanlydiem.Model.SinhVien;

import java.util.List;
import java.util.Optional;

public interface HocvienService {

    List<SinhVien> findAll();

    Optional<SinhVien> findById(Integer integer);

    SinhVien save(SinhVien sv);

    void deleteById(Integer integer);

    SinhVien updateSv(Integer id, SinhVien sv);
}
