package vn.stu.quanlydiem.Service.CustomUserDetails;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import vn.stu.quanlydiem.Model.Nguoidung;
import vn.stu.quanlydiem.Responsitory.NguoidungRepository;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class CustomUserDetailsService  implements UserDetailsService {
    private NguoidungRepository nguoidungRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Nguoidung user=nguoidungRepository.findByTenDangNhap(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }else
            return new org.springframework.security.core.userdetails.User(
                    user.getTenDangNhap(),user.getMatKhau(), Collections.singleton(new SimpleGrantedAuthority(user.getMaVaiTro().getTenVaiTro())));
            
    }


}
