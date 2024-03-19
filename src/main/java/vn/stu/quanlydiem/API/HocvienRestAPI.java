package vn.stu.quanlydiem.API;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.stu.quanlydiem.Model.SinhVien;
import vn.stu.quanlydiem.Service.Hocvien.HocvienService;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/hocvien")
public class HocvienRestAPI {
    @Autowired
    private final HocvienService hocvienService;


    @GetMapping
    public List<SinhVien> showHocVien(){
        return hocvienService.findAll();
    }
}
