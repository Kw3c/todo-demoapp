package com.example.demo.user.repository;

import com.example.demo.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {

    //이메일 주소를 통해 회원 조회
    UserEntity findUserByEmail(String email);

    //이메일 주소 중복 조회
    boolean existByEmail(String email);

    //회원가입하기
    boolean register(UserEntity entity);

    //회원의 프로필 사진 경로 조회
    String findProfile(String userId);
}
