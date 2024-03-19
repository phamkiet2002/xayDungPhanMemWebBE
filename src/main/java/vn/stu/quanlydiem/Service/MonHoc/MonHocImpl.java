package vn.stu.quanlydiem.Service.MonHoc;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import vn.stu.quanlydiem.Model.Monhoc;
import vn.stu.quanlydiem.Responsitory.MonHocRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class MonHocImpl implements MonHocService {
    private MonHocRepository monHocRepository;


    @Override
    public List<Monhoc> getAll() {
        return monHocRepository.findAll();
    }
}
