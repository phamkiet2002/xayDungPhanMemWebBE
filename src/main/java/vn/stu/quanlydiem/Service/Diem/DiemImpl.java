package vn.stu.quanlydiem.Service.Diem;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import vn.stu.quanlydiem.Model.Diem;
import vn.stu.quanlydiem.Responsitory.DiemResponsitory;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class DiemImpl implements DiemService{
    private DiemResponsitory diemResponsitory;

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
    public Diem save(Diem entity) {
        return diemResponsitory.save(entity);
    }

    @Override
    public Diem updateDiem(Long id, Diem diem){
        Diem diem1=diemResponsitory.findById(id).orElseThrow(() -> new EntityNotFoundException("Khong co bang diem voi id"+id));
        diem1.setDiem(diem.getDiem());
        return diem1;
    }
}
