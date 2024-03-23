package vn.stu.quanlydiem.Service.Hocvien;


import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import vn.stu.quanlydiem.Model.SinhVien;
import vn.stu.quanlydiem.Responsitory.HocvienRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class HocvienImpl implements HocvienService{
    private HocvienRepository hocvienRepository;

    @Override
    public List<SinhVien> findAll() {
        return hocvienRepository.findAll();
    }

    @Override
    public Optional<SinhVien> findById(Integer integer) {
        return hocvienRepository.findById(integer);
    }

    @Override
    public SinhVien save(SinhVien sv) {
        return hocvienRepository.save(sv);
    }

    @Override
    public void deleteById(Integer integer) {
        hocvienRepository.deleteById(integer);
    }

    @Override
    public SinhVien updateSv(Integer id, SinhVien sv){
        SinhVien sv1=hocvienRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Khong co sinh vien voi id:"+id));
        sv1.setTen(sv.getTen());
        sv1.setEmail(sv.getEmail());
        sv1.setLophoc(sv.getLophoc());
        sv1.setDiaChi(sv.getDiaChi());
        sv1.setSoDienThoai(sv.getSoDienThoai());
        return sv1;
    }
}
