package com.example.demo.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Student {
    private int studentNo;
    private String name;
    private int age;
    private String sex;
    private int score;
    private Date regDate;
}
