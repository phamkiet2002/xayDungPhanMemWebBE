package vn.stu.quanlydiem.API;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.stu.quanlydiem.Model.Lophoc;
import vn.stu.quanlydiem.Service.Lophoc.LophocService;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/lophoc")

public class LopHocController {
    @Autowired
    private final LophocService lophocService;

    @GetMapping
    public ResponseEntity<List<Lophoc>> getAll() {
        return ResponseEntity.ok().body(lophocService.getAllLopHoc());
    }


    @PostMapping
    public ResponseEntity<Lophoc> createCategory(@RequestBody Lophoc id) {
        Lophoc lophoc = lophocService.save(id);
        return ResponseEntity.ok().body(lophoc);
    }

    @PutMapping("{id}")
    public ResponseEntity<Lophoc> UpdateLop(@PathVariable("id") Integer idLop,
                                            @RequestBody Lophoc lophoc) {
        Lophoc lh = lophocService.updateCategory(idLop, lophoc);
        return ResponseEntity.ok(lh);
    }


    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable Integer id) {
        lophocService.deleteById(id);
        return ResponseEntity.ok("xoa Lop voi id = " + id);
    }

    @GetMapping("{id}")
    public ResponseEntity<Lophoc> getCate(@PathVariable Integer id) {
        Optional<Lophoc> lophoc = lophocService.findById(id);

        if (lophoc.isPresent()) {
            return ResponseEntity.ok(lophoc.get());
        } else {
            throw new RuntimeException("Khong tim thay");
        }
    }

}
