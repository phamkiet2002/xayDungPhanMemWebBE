package vn.stu.quanlydiem.API;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.stu.quanlydiem.Model.Diem;
import vn.stu.quanlydiem.Service.Diem.DiemService;
import vn.stu.quanlydiem.dto.DiemDTO;


import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/diem")
public class DiemRestAPI {
    @Autowired
   private DiemService diemService;

    @GetMapping
    public List<Diem> showDiem(){
        return diemService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Diem> getDiemById(@PathVariable Long id){
        Optional<Diem> diem=diemService.findById(id);
        if(diem.isPresent()){
            return ResponseEntity.ok().body(diem.get());
        }else
            throw new RuntimeException("Khong co bang diem voi id"+id);
    }

    @PostMapping
    public ResponseEntity<Diem> createDiem(@RequestBody DiemDTO diem){
        Diem diem1=diemService.save(diem);
        return ResponseEntity.ok(diem1);

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDiemById(@PathVariable Long id){
        try {
            diemService.deleteById(id);
            return ResponseEntity.ok("Xoa thanh cong");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Loi");
        }
    }
    @PutMapping("/{id}")
    public ResponseEntity<Diem> updateDiemById(@PathVariable Long id, @RequestParam Float diem){
        Diem diem1=diemService.updateDiem(id,diem);
        return ResponseEntity.ok(diem1);
    }
}
