package vn.stu.quanlydiem.API;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import vn.stu.quanlydiem.Model.Diem;

import vn.stu.quanlydiem.Model.SinhVien;
import vn.stu.quanlydiem.Service.Hocvien.HocvienService;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/hocvien")
public class HocvienRestAPI {
    @Autowired
    private final HocvienService hocvienService;

    // function get list dv
    @GetMapping
    public ResponseEntity<List<SinhVien>> showHocVien() {
        return ResponseEntity.ok().body(hocvienService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SinhVien> show1HocVien(@PathVariable Integer id) {
        Optional<SinhVien> sinhvien = hocvienService.findById(id);
        if (sinhvien.isPresent()) {
            return ResponseEntity.ok(sinhvien.get());
        } else {
            throw new RuntimeException("Không tim thấy");
        }
    }

    //function create sv
    @PostMapping
    public ResponseEntity<SinhVien> createHocVien(@RequestBody SinhVien sv) {
        SinhVien sinhVien = hocvienService.save(sv);
        return ResponseEntity.ok(sinhVien);
    }

    //function delete sv
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteHocVienById(@PathVariable Integer id) {
        try {
            Optional<SinhVien> sinhvien = hocvienService.findById(id);
            if (!sinhvien.isPresent()) {
                return ResponseEntity.status(404).body("Không tìm thấy sinh viên để xóa");
            }
            hocvienService.deleteById(id);
            return ResponseEntity.ok().body("Đã xóa sinh viên thành công");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Lỗi trong quá trình xóa sinh viên");
        }
    }

    //function update sv
    @PutMapping("/{id}")
    public ResponseEntity<String> updateHocVienById(@PathVariable Integer id, @RequestBody SinhVien sv) {
        try {
            Optional<SinhVien> sinhvien = hocvienService.findById(id);
            if (!sinhvien.isPresent()) {
                return ResponseEntity.status(404).body("Không tìm thấy sinh viên để cập nhật");
            }
            sv.setIdsinhvien(id);
            hocvienService.save(sv);
            return ResponseEntity.ok().body("Đã cập nhật thông tin sinh viên thành công");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Lỗi trong quá trình cập nhật thông tin sinh viên");
        }
    }

}
