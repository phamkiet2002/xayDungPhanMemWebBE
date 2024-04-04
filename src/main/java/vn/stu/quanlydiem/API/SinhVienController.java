package vn.stu.quanlydiem.API;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.stu.quanlydiem.Model.SinhVien;
import vn.stu.quanlydiem.Service.Hocvien.HocvienService;

import java.util.List;

@CrossOrigin("*")
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/sinhvien")
public class SinhVienController {
    @Autowired
    private final HocvienService hocvienService;

    @GetMapping
    public ResponseEntity<List<SinhVien>> getAllSinhVien(){
        return ResponseEntity.ok().body(hocvienService.findAll());
    }
}
