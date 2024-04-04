package vn.stu.quanlydiem.API;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
<<<<<<< HEAD
import vn.stu.quanlydiem.Model.Diem;
=======
>>>>>>> cab6bac70e308f06d501cc15a58ebacd0c3f9cef
import vn.stu.quanlydiem.Model.SinhVien;
import vn.stu.quanlydiem.Service.Hocvien.HocvienService;

import java.util.List;
import java.util.Optional;
<<<<<<< HEAD

=======
>>>>>>> cab6bac70e308f06d501cc15a58ebacd0c3f9cef
@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/hocvien")
public class HocvienRestAPI {
    @Autowired
    private final HocvienService hocvienService;
    @GetMapping
    public ResponseEntity<List<SinhVien>> showHocVien(){
        return ResponseEntity.ok().body(hocvienService.findAll());
    }
<<<<<<< HEAD

=======
>>>>>>> cab6bac70e308f06d501cc15a58ebacd0c3f9cef
    @GetMapping("/{id}")
    public ResponseEntity<SinhVien> show1HocVien(@PathVariable Integer id){
        Optional<SinhVien> sinhvien=hocvienService.findById(id);
        if (sinhvien.isPresent()){
            return ResponseEntity.ok(sinhvien.get());
        }
        else {
            throw new RuntimeException("Không tim thấy");
        }
    }
    @PostMapping
    public ResponseEntity<SinhVien> createHocVien(@RequestBody SinhVien sv){
        SinhVien sinhVien=hocvienService.save(sv);
        return ResponseEntity.ok(sinhVien);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteHocVienById(@PathVariable Integer id){
        hocvienService.deleteById(id);
        return ResponseEntity.ok().body("Da xoa thanh cong");
    }
    @PutMapping("/{id}")
    public ResponseEntity<SinhVien> updateHocVienById(@PathVariable Integer id,@RequestBody SinhVien sv){
        SinhVien sinhVien=hocvienService.updateSv(id,sv);
        return ResponseEntity.ok(sinhVien);
    }
}
