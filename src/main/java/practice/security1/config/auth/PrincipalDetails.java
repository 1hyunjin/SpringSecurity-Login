package practice.security1.config.auth;

// security가 /login 주소 요청이 오면 낚아채서 로그인을 진행시킨다.
// 로그인 진행이 완료가 되면 시큐리티 session을 만들어줍니다. (Security ContextHolder)
// session에 들어갈 수 있는 object 타입 -> Authentication타입 객체
// Authentication 안에 User정보가 있어야 됨.
// 클래스가 정해져있음. User object 타입 -> UserDetails 타입 객체

// Security Session => Authentication => UserDetails(PrincipalDetails)

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import practice.security1.model.User;

import java.util.ArrayList;
import java.util.Collection;

public class PrincipalDetails implements UserDetails {

    private practice.security1.model.User user; //composition

    public PrincipalDetails(User user) {
        this.user = user;
    }
    // 해당 user의 권한을 return 하는 곳
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> collect = new ArrayList<>();
        collect.add(new GrantedAuthority() {
            @Override
            public String getAuthority() {
                return user.getRole();
            }
        });
        return collect;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {

        // 우리 사이트 -> 1년동안 회원이 로그인을 안하면 휴먼 계정으로 하기로 함.
        // 현재 시간 - 로그인 시간 -> 1년 초과 시 return false 하는 부분!
        // user.getLoginDate();
        return true;
    }
}
