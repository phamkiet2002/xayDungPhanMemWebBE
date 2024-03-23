package vn.stu.quanlydiem.API;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.stu.quanlydiem.Model.Lophoc;
import vn.stu.quanlydiem.Model.Monhoc;
import vn.stu.quanlydiem.Model.SinhVien;
import vn.stu.quanlydiem.Service.MonHoc.MonHocImpl;
import vn.stu.quanlydiem.Service.MonHoc.MonHocService;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/monhoc")
public class MonHocController {
    @Autowired
    private MonHocService monHocService;

    @GetMapping
    public ResponseEntity<List<Monhoc>> getAllMH(){
        return ResponseEntity.ok().body(monHocService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Monhoc> getMHById(@PathVariable Integer id){
        Optional<Monhoc> monhoc=monHocService.findById(id);
        if (monhoc.isPresent()){
            return ResponseEntity.ok(monhoc.get());
        }else {
            throw new RuntimeException("Không tim thấy");
        }
    }

    @PostMapping
    public ResponseEntity<Monhoc> createMH(@RequestBody Monhoc monhoc){
        Monhoc lophoc=monHocService.save(monhoc);
        return ResponseEntity.ok(monhoc);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMHById(@PathVariable Integer id){
        monHocService.deleteById(id);
        return ResponseEntity.ok("Da xoa mon hoc voi id la"+id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Monhoc> updateMHById(@PathVariable Integer id,@RequestBody Monhoc monhoc){
        Monhoc mon=monHocService.updateMonHoc(id,monhoc);
        return ResponseEntity.ok(mon);
    }
}
