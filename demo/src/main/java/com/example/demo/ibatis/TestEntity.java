package com.example.demo.ibatis;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter @Getter
public class TestEntity {

    private String id;
    private String username;
    private int age;

    public TestEntity() {
        this.id = UUID.randomUUID().toString();
    }
}
