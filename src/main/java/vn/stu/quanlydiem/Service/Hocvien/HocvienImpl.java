package vn.stu.quanlydiem.Service.Hocvien;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import vn.stu.quanlydiem.Model.SinhVien;
import vn.stu.quanlydiem.Responsitory.HocvienRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class HocvienImpl implements HocvienService{
    private HocvienRepository hocvienRepository;

    @Override
    public List<SinhVien> findAll() {
        return hocvienRepository.findAll();
    }

}
