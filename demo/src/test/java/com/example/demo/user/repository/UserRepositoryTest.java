package com.example.demo.user.repository;

import com.example.demo.user.entity.UserEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    UserRepository repository;

    @Test
    @DisplayName("회원가입에 성공해야 한다.")
    void registerTest() {
        // given
        UserEntity user = new UserEntity();
        user.setEmail("apple@gmail.com");
        user.setPassword("1234");
        user.setUsername("팀쿡");

        // when
        boolean flag = repository.register(user);

        // then
        assertTrue(flag);
    }

    @Test
    @DisplayName("이메일이 중복되면 true가 리턴되어야 한다.")
    void existEmailTest() {
        // given
        String email = "apple@gmail.com";

        // when
        boolean flag = repository.existByEmail(email);

        // then
        assertTrue(flag);

    }

    @Test
    @DisplayName("이메일을 통해 회원정보를 모두 조회해야 한다.")
    void findUserTest() {
        // given
        String email = "apple@gmail.com";
        // when
        UserEntity user = repository.findUserByEmail(email);

        // then
        assertNotNull(user);
        assertEquals("팀쿡", user.getUsername());

    }

}