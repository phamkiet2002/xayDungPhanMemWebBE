package vn.stu.quanlydiem.Service.Nguoidung;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import vn.stu.quanlydiem.Model.Nguoidung;
import vn.stu.quanlydiem.Responsitory.NguoidungRepository;

@AllArgsConstructor
@Service
public class NguoidungImpl implements NguoidungService{
    private NguoidungRepository nguoidungRepository;

    @Override
    public Nguoidung findByTenDangNhap(String username) {
        return nguoidungRepository.findByTenDangNhap(username);
    }
}
