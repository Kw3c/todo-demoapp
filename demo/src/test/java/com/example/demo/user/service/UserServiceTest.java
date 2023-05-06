package com.example.demo.user.service;

import com.example.demo.user.entity.UserEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Autowired
    UserService userService;
    @Test
    @DisplayName("회원가입되지 않은 이메일을 사용해 로그인하면 예외가 발생")
    void loginTest1() {
        //given
            String email = "zzzzz@zzzzz.com";
        //when
            userService.validateLogin(email,"");
        //then
    }

    @Test
    @DisplayName("로그인이 성공하면 회원데이터가 리턴된다.")
    void loginTest2() {
        // given
        String email = "apple@gmail.com";
        String password = "12345";
        // when
        UserEntity user = userService.validateLogin(email, password);
        // then
        assertNotNull(user);
        assertEquals(email, user.getEmail());
    }
}