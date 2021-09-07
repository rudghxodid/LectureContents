package com.example.demo.controller.member.request;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@NoArgsConstructor
public class MemberRequest {
    private Long memberNo;
    private String userId;
    private String name;
    private String address;
    private String password;
    private String auth;



}
