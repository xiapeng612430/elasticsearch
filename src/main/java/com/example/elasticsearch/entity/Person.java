package com.example.elasticsearch.entity;

import lombok.Data;

/**
 * @date 2020/04/22
 * @time 12:49
 */
@Data
public class Person {

    private String name;
    private Integer age;
    private Integer gender;
    private String desc;

    public Person() {
    }

    public Person(String name, Integer age, Integer gender, String desc) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.desc = desc;
    }
}
