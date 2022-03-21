package com.glowsoft.spring_test.controller;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.glowsoft.spring_test.dto.TestRequestBodyDTO;
import com.glowsoft.spring_test.dto.ResponseDTO;


import java.util.ArrayList;
import java.util.List;



@RestController
@RequestMapping("test")


public class HomeController {



    @GetMapping( "/testResponseBody")
    public ResponseDTO<String> testControllerResponseBody(){
        List<String > list = new ArrayList<>();
        list.add("Hello World! I'm ResponseDTO");
        ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
        return response;
    }

}