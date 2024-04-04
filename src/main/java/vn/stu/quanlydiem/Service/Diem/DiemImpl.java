package vn.stu.quanlydiem.Service.Diem;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import vn.stu.quanlydiem.Model.Diem;
import vn.stu.quanlydiem.Model.Monhoc;
import vn.stu.quanlydiem.Model.SinhVien;
import vn.stu.quanlydiem.Responsitory.DiemResponsitory;
import vn.stu.quanlydiem.Responsitory.HocvienRepository;
import vn.stu.quanlydiem.Responsitory.MonHocRepository;
import vn.stu.quanlydiem.dto.DiemDTO;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class DiemImpl implements DiemService{
    private DiemResponsitory diemResponsitory;
    private HocvienRepository hocvienRepository;
    private MonHocRepository monHocRepository;

    @Override
    public List<Diem> findAll() {
        return diemResponsitory.findAll();
    }

    @Override
    public Optional<Diem> findById(Long aLong) {
        return diemResponsitory.findById(aLong);
    }

    @Override
    public void deleteById(Long aLong) {
        diemResponsitory.deleteById(aLong);
    }



    @Override
    public Diem save(DiemDTO diemDTO) {
        Diem diem=new Diem();
        diem.setDiem(diemDTO.getDiem());
        diem.setMonhoc(monHocRepository.findById(diemDTO.getIdMH()).get());
        diem.setSinhVien(hocvienRepository.findById(diemDTO.getIdSV()).get());
        return diemResponsitory.save(diem);
    }

    @Override
    public Diem updateDiem(Long id, Float diem){
        Diem diem1=diemResponsitory.findById(id).get();
        diem1.setDiem(diem);

        return diemResponsitory.save(diem1);
    }

    @Override
    public Optional<Diem> FindBySVAndMH(Integer idSV, Integer idMH) {
        SinhVien sinhVien=hocvienRepository.findById(idSV).get();
        Monhoc monhoc=monHocRepository.findById(idMH).get();
        try {
            Diem diem=diemResponsitory.findBySinhVienAndMonhoc(sinhVien,monhoc).get();

        }catch (Exception e){
            throw new EntityNotFoundException("Not found");
        }
        return Optional.empty();
    }

}
