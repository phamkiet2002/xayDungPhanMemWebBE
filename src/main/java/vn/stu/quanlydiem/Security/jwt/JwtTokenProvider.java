package vn.stu.quanlydiem.Security.jwt;

import io.jsonwebtoken.Jwts;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties;
import org.springframework.stereotype.Component;
import vn.stu.quanlydiem.Service.CustomUserDetails.CustomUserDetailsService;

import java.util.Date;

@Component
@Slf4j
public class JwtTokenProvider {
    //private key
    private final String JWT_SECRET="stu";

    //Thoi gian hieu luc
    private final long JWT_EXPIRATION=10000000L;

    //Tao jwt tu user
//    public String generateToken(CustomUserDetailsService customUserDetailsService){
//        Date now=new Date();
//        Date expiryDate=new Date(now.getTime()+JWT_EXPIRATION);
//        return Jwts.builder()
//                .setSubject(Integer.toString(customUserDetailsService.));
//    }
}
