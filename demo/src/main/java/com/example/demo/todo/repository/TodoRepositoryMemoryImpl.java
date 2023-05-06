//package com.example.demo.rest.todo.repository;
//import com.example.demo.rest.todo.entity.ToDo;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//// 역할: 할 일 데이터를 메모리에 CRUD 하는 역할
//@Repository
//public class TodoRepositoryMemoryImpl implements TodoRepository {
//
////    메모리 저장소
//    /**
//     * key: 할 일의 식별 id값
//     * value: 할 일 집합객체
//     */
//    private static final Map<String, ToDo> toDoMap = new HashMap<>();
//
//    static {
////        toDoMap.put(1L, new ToDo("do something"));
////        toDoMap.put(2L, new ToDo("study java"));
////        toDoMap.put(3L, new ToDo("f**kin hard"));
//    }
//
//    @Override
//    public boolean save(ToDo todo) {
//        if (todo == null) return false;
//
//        toDoMap.put(todo.getId(), todo);
//        return true;
//    }
//
//    @Override
//    public List<ToDo> findAll() {
//
//        List<ToDo> toDoList = new ArrayList<>();
//        for (String id : toDoMap.keySet()) {
//            ToDo toDo = toDoMap.get(id);
//            toDoList.add(toDo);
//        }
//        return toDoList;
//    }
//
//    @Override
//    public ToDo findOne(String id) {
//        return toDoMap.get(id);
//    }
//
//    @Override
//    public boolean remove(String id) {
//        ToDo todo = toDoMap.remove(id);
//        return todo != null;
//    }
//}