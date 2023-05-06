package com.example.demo.ibatis;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TestRepositoryTest {
    @Autowired TestRepository repository;

    @Test
    @DisplayName("유저이름과 나이가 TBL_TEST 테이블에 저장되어야한다.")
    void saveTest() {
        //given : 테스트 상황에 주어질 데이터
        TestEntity entity = new TestEntity();
        entity.setUsername("골리앗");
        entity.setAge(33);

        //when : 테스트 실행
        boolean flag = repository.save(entity);

        //then : 결과 단언
        assertTrue(flag);
        assertNotNull(entity.getId());
    }

    @Test
    @DisplayName("유저이름과 나이를 수정해야 한다.")
    void modifyTest() {
        //given
        TestEntity entity = new TestEntity();
        entity.setUsername("골리앗");
        entity.setAge(30);
        entity.setId("e520aa84-b6bc-4ab2-97a7-beb26b84c388");

        //when
        boolean flag = repository.modify(entity);

        //then
        assertTrue(flag);
    }

    @Test
    @DisplayName("유저를 삭제해야 한다.")
    @Transactional
    @Rollback
    void deleteTest() {
        //given
        String id = "e520aa84-b6bc-4ab2-97a7-beb26b84c388";
        //when
        boolean flag = repository.remove(id);
        //then
        assertTrue(flag);
    }

    @Test
    @DisplayName("테스트 데이터 전체 조회.")
    void findAllTest() {
        //given
        //when
        List<TestEntity> entityList = repository.findAll();
        //then
        System.out.println(entityList);
        assertEquals(3, entityList.size());
    }
}
