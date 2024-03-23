package vn.stu.quanlydiem.Service.MonHoc;


import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import vn.stu.quanlydiem.Model.Monhoc;
import vn.stu.quanlydiem.Responsitory.MonHocRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class MonHocImpl implements MonHocService {
    private MonHocRepository monHocRepository;


    @Override
    public List<Monhoc> getAll() {
        return monHocRepository.findAll();
    }

    @Override
    public Monhoc  save(Monhoc monhoc) {
        return monHocRepository.save(monhoc);
    }

    @Override
    public Optional<Monhoc> findById(Integer integer) {
        return monHocRepository.findById(integer);
    }

    @Override
    public void deleteById(Integer integer) {
        monHocRepository.deleteById(integer);
    }

    @Override
    public Monhoc updateMonHoc(Integer id, Monhoc monhoc){
        Monhoc mh=monHocRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Khong ton tai mon hoc voi id:"+id));
        mh.setTenMH(monhoc.getTenMH());
        mh.setSoTc(monhoc.getSoTc());
        monHocRepository.save(mh);
        return mh;
    }

}
