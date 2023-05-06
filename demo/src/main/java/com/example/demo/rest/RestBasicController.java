package com.example.demo.rest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

//@RestController
@Controller
@ResponseBody //응답시 html을 응답하지 않고 json으로 응답.
public class RestBasicController {

    @GetMapping("/china")
    public List<String> food() {
        List<String> foodList = Arrays.asList("짜장면","짬뽕","마파두부");
        return foodList;
    }

    @GetMapping("/number")
    public int[] numbers() {
        int[] arr = {2,4,6,8};
                return arr;
    }

    @GetMapping("/hobby")
    public Map<String, String> hobbies() {
        Map<String, String> hobbies = new HashMap<>();

        hobbies.put("운동", "축구");
        hobbies.put("여가", "산책");
        hobbies.put("맛집", "고기");
        return hobbies;
    }

    @GetMapping("/score")
    public Score score() {
        return new Score("철수",90,90,'A');
    }

    @GetMapping("/score-list")
    public List<Score> scoreList() {
        return Arrays.asList(
            new Score("철수",90,90,'A'),
            new Score("진수",80,80,'B'),
            new Score("정수",100,90,'A')
        );
    }

    @Setter @Getter @ToString @AllArgsConstructor
    public static class Score {
        private String name;
        private int javaExam;
        private int mathExam;
        private char grade;
    }
}
