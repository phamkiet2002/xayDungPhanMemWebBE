package vn.stu.quanlydiem.API;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.stu.quanlydiem.Model.Monhoc;
import vn.stu.quanlydiem.Model.SinhVien;
import vn.stu.quanlydiem.Service.MonHoc.MonHocService;

import java.util.List;

@CrossOrigin("*")
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/monhoc")
public class MonHocController {
    private final MonHocService monHocService;

    @GetMapping
    public List<Monhoc> getAllMH(){
        return monHocService.getAll();
    }
}
