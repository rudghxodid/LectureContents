package com.example.demo.repository;


import com.example.demo.entity.Dungeon;
import com.example.demo.entity.Monster;
import com.example.demo.entity.Student;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Repository
public class VueStudentRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Student> list() throws Exception {

        int avg = jdbcTemplate.queryForObject(
                "select avg(score) from student",
                Integer.class
        );

        List<Student> results = jdbcTemplate.query(
                "select studentNo, name, age, sex, score from student " +
                        "where studentNo > 0 order by studentNo desc",

                new RowMapper<Student>() {
                    @SneakyThrows
                    @Override
                    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Student student = new Student();

                        student.setStudentNo(rs.getInt("studentNo"));
                        student.setName(rs.getString("name"));
                        student.setAge(rs.getInt("age"));
                        student.setSex(rs.getString("sex"));
                        student.setScore(rs.getInt("score"));
                        student.setRegDate(rs.getDate("regDate"));



                        return student;
                    }
                }
        );

        return results;
    }
}