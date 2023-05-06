//package com.example.demo.todo.repository;
//
//import com.example.demo.todo.entity.ToDo;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//import java.util.UUID;
//
//import static org.junit.jupiter.api.Assertions.*;
//@SpringBootTest //스프링 컨테이너를 테스트 클래스에서 사용 가능하게 해주는 어노테이션
//class TodoRepositoryMemoryImplTest {
//
//    @Autowired
//    TodoRepository repository;
//
//    @Test
//    @DisplayName("저장소에서 목록을 조회 했을 때 할 일의 수가 3개 여야 한다.")
//    void findAllTest() {
//        //given : 테스트 시 필요한 데이터
//
//        //when : 테스트의 실제 상황
//        List<ToDo> toDoList = repository.findAll();
//        //then : 테스트 결과
//        assertEquals(3, toDoList.size());
//        assertNotNull(toDoList);
//    }
//    @Test
//    @DisplayName("아이디가 2번인 할 일 데이터 의 작성자 이름은 일리단")
//    void findOneTest() {
//        String id = UUID.randomUUID().toString();
//
//        ToDo toDo = repository.findOne(id);
//
//        assertEquals("일리단",toDo.getUserId());
//    }
//
//    @Test
//    @DisplayName("1번 할 일을 삭제 한 후 다시 조회 했을 때 null 반환")
//        void removeTest() {
//        //given
//        String id = "";
//        //when
//        boolean flag = repository.remove(id);
//        ToDo toDo = repository.findOne(id);
//        //then
//        assertTrue(flag);
//        assertNull(toDo);
//        }
//
//        @Test
//        @DisplayName("4번 할일 등록. 전체 목록 개수 4개")
//            void saveTest() {
//            //given
//            ToDo newTodo = new ToDo("", "쓰랄", "응애", false);
//            //when
//            boolean flag = repository.save(newTodo);
//            List<ToDo> toDoList = repository.findAll();
//
//            // then
//            assertEquals("쓰랄", newTodo.getUserId());
//
//            assertTrue(flag);
//            assertEquals(4, toDoList.size());
//
//            }
//}