package vn.stu.quanlydiem.Service.Lophoc;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.stu.quanlydiem.Model.Lophoc;
import vn.stu.quanlydiem.Responsitory.LopHocRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class LophocImpl implements LophocService {

    private final LopHocRepository lopHocRepository;

    @Override
    public List<Lophoc> getAllLopHoc() {
        return lopHocRepository.findAll();
    }

    @Override
    public Lophoc save(Lophoc lophoc) {
        return lopHocRepository.save(lophoc);
    }

    @Override
    public Optional<Lophoc> findById(Integer integer) {
        return lopHocRepository.findById(integer);
    }

    @Override
    public void deleteById(Integer integer) {
        lopHocRepository.deleteById(integer);
    }

    @Override
    public Lophoc updateCategory(Integer LopId, Lophoc lophoc) {
        Lophoc lop  = lopHocRepository.findById(LopId).orElseThrow(
                () -> new EntityNotFoundException("khong ton tai Lop hoc voi ID" + LopId)
        );
        lop.setTenlop(lophoc.getTenlop());
        lopHocRepository.save(lop);
        return lop;
    }
}
