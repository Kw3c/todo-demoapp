package com.example.demo.user.entity;

import com.example.demo.user.dto.UserRequestDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Setter @Getter @ToString
@AllArgsConstructor
public class UserEntity {
//entity class는 db테이블과 1:1 매칭으로 작성
    private String id;
    private String username;
    private String email;
    private String password;
    private String profileImg;

    public UserEntity() {
        this.id = UUID.randomUUID().toString();
    }

    //dto를 entity로 변환
    public UserEntity(UserRequestDTO dto) {
        this(); //생성자 호출 (id 초기화)
        this.email = dto.getEmail();
        this.username = dto.getUsername();
        this.password = dto.getPassword();
    }
}

//Entity는 DB에서 자료 받아올 때 외에는 사용을 안하는 것이 좋다.
