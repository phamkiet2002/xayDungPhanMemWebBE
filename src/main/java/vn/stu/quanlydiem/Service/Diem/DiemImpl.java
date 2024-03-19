package vn.stu.quanlydiem.Service.Diem;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import vn.stu.quanlydiem.Model.Diem;
import vn.stu.quanlydiem.Responsitory.DiemResponsitory;

import java.util.List;

@AllArgsConstructor
@Service
public class DiemImpl implements DiemService{
    private DiemResponsitory diemResponsitory;

    @Override
    public List<Diem> findAll() {
        return diemResponsitory.findAll();
    }
}
