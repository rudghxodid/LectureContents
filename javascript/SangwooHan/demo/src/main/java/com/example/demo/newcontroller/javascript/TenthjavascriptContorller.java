package com.example.demo.newcontroller.javascript;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class TenthjavascriptContorller {
    @GetMapping("/getJavaScripptPromptTest")
    public String getJavaScripptPromptTest(){
        log.info("getJavaScripptPromptTest()");

        return "/javascript/tenth/prompt";
    }
    @GetMapping("/gertQuerySelectTest")
    public String getQuerySelectTest(){
        log.info("getQuerySelectTest()");

        return "/javascript/tenth/querySelect";
    }

    @GetMapping("/getDivideElementTest")
    public String getDivideElementTest(){
        log.info("getDivideElementTest()");

        return "/javascript/tenth/divideElement";
    }

    @GetMapping("/getJavaScriptTimeTest")
    public String getJavaScriptTimeTest(){
        log.info("getJavaScriptTimeTest()");

        return "/javascript/tenth/jsTime";
    }

    @GetMapping("/getSaleProductTest")
    public  String getSaleProductTest(){
        log.info("getSaleProductTest()");

        return "/javascript/tenth/SaleProduct";
    }

    @GetMapping("/getIfTest")
    public  String getIfTest(){
        log.info("getIfTest()");
        return "/javascript/tenth/ifTest";
    }

    @GetMapping("/getSwitchTest")
    public  String getSwitchTest(){
        log.info("getSwitchTest()");

        return "/javascript/tenth/switchTest";
    }

    @GetMapping("/getForTest")
    public String getForTest(){
        log.info("getForTest()");

        return "/javascript/tenth/forTest";
    }
    @GetMapping("getAddNumber")
    public String getAddNumber() {
        log.info("getAddNumber()");

        return "/javascript/tenth/addNum";
    }

    @GetMapping("/getMouseOverTest")
    public String getMouseOverTest(){
        log.info("getMouseOverTest()");

        return "/javascript/tenth/mouseOver";
    }
    @GetMapping("getInvisibilityTest")
    public String getInvisibilityTest(){
        log.info("getInvisibilityTest()");

        return "/javascript/tenth/invisibility";
    }
}
