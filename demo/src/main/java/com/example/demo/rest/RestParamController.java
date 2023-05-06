package com.example.demo.rest;

import lombok.*;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/param")
public class RestParamController {
    @GetMapping("/user") //URL : /param/user
    public String userName(HttpServletRequest request) {
        String name = request.getParameter("name");
        return String.format("Your name is %s.",name);
    }
    @GetMapping("/user2") //지역 변수 안에서 메서드 이름이 겹칠때 활용 할 수 있는 방법.
    public String userName(
            @RequestParam(value = "name", required = false) String nm,
            @RequestParam(defaultValue = "10") int age
    ) {return String.format("Your name is %s, age is %d.",nm,age);
    }

    @GetMapping("/user3")
    public  String user3(UserDTO userInfo) {
        return String.format(
                "Your name is %s, age is %d, address is %s, height is %.2fcm , hobby is %s .",
                userInfo.getName(),
                userInfo.getAge(),
                userInfo.getAddr(),
                userInfo.getHeight(),
                userInfo.getHobby()
        );
    }

    @GetMapping("/user4/{userNum}")
    public String user4(@PathVariable int userNum) {
        return String.format("회원번호는 %d번 입니다.",userNum);
    }

    @Setter @Getter @ToString  //Setter, NoArgs 는 필수.
    @NoArgsConstructor @AllArgsConstructor
    public static class UserDTO {
        private String name;
        private int age;
        private String addr;
        private double height;
        private List<String> hobby;
    }
}
