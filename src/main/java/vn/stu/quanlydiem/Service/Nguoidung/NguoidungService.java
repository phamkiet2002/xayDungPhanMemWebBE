package vn.stu.quanlydiem.Service.Nguoidung;

import vn.stu.quanlydiem.Model.Nguoidung;

public interface NguoidungService {
    Nguoidung findByTenDangNhap(String username);
}
