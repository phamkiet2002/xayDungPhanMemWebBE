package vn.stu.quanlydiem.Service.Diem;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import vn.stu.quanlydiem.Model.Diem;

import java.util.List;


public interface DiemService {
    List<Diem> findAll();
}
