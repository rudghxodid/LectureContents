package com.example.demo.file;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/file")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class VueFileController {

    @PostMapping("/uploadImg")
    @ResponseBody
    public String requestUploadFile(
            // @RequestParam("fileList") List<MultipartFile> fileList) {
            @RequestParam("fileList") List<MultipartFile> fileList) {

        log.info("requestUploadFile(): " + fileList);

        try {
            // 결국 저장되는 위치가 images/사진파일명.확장자
            // images/아이디/사진파일명.확장자
            for (MultipartFile multipartFile : fileList) {
                log.info("requestUploadFile(): Make File");
                FileOutputStream writer = new FileOutputStream("C:\\java_work\\LectureContents\\javascript\\TaeyangLee\\solo\\src\\assets\\img\\" + multipartFile.getOriginalFilename());
                writer.write(multipartFile.getBytes());

                writer.close();
            }

            /*
            FileOutputStream writer = new FileOutputStream("./images/" + fileList.getOriginalFilename());
            writer.write(fileList.getBytes());
            writer.close();
             */
        } catch (Exception e) {
            return "Upload Fail!!!";
        }

        log.info("requestUploadFile(): Success!!!");

        return "Upload Success!!!";
    }
}
