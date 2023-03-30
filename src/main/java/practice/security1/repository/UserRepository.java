package practice.security1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import practice.security1.model.User;

//CRUD 함수를 JPARepository가 들고 있음.
// @Repository 라는 annotation이 없어도 IoC 됨 (JPARepository 상속해서)
public interface UserRepository extends JpaRepository<User, Integer> {  //pk가 id로 int 타입이니까 Integer로
    // findBy 규칙 -> Username 문법
    // select * from user where username = 1? 호출 (Jpa query method)
    public User findByUsername(String username);

    // select * from user where email = ?
//    public User findByEmail();

}
