package com.example.demo.entity;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
//jpa 사용시필수적인 annatation이 entity
@Entity
@ToString

public class JpaMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberNo;



    @Column(length = 20, nullable = false)
    private String id;

    @Column(length = 20, nullable = false)
    private String pw;

    @Column(length = 20, nullable = false)
    private String regDate;

    @Builder
    public JpaMember(String id, String pw, String regDate) {

        this.id = id;
        this.pw = pw;
        this.regDate = regDate;
    }

}
