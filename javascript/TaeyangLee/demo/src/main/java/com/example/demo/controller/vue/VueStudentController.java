package com.example.demo.controller.vue;

import com.example.demo.entity.Dungeon;
import com.example.demo.entity.Monster;
import com.example.demo.entity.Product;
import com.example.demo.entity.Student;
import com.example.demo.service.VueDungeonService;
import com.example.demo.service.VueGameService;
import com.example.demo.service.VueProductService;
import com.example.demo.service.VueStudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/vuestudent")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class VueStudentController {

    @Autowired
    private VueStudentService service;

    @GetMapping("/student")
    public ResponseEntity<List<Student>> getListStudent () throws Exception {
        log.info("getLists()");

        return new ResponseEntity<>(service.list(), HttpStatus.OK);
    }


}