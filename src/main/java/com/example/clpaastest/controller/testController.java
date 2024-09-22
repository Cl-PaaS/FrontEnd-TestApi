package com.example.clpaastest.controller;

import com.example.clpaastest.dto.returnDto;
import com.example.clpaastest.dto.testDto;
import com.example.clpaastest.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class testController {

    private testService testservice;

    @Autowired
    public testController(testService testservice) {
        this.testservice = testservice;
    }

    @PostMapping("/message1")
    public ResponseEntity testApi1(@RequestBody testDto testdto){
        returnDto returndto = testservice.testService(testdto);
        return ResponseEntity.status(HttpStatus.OK).body(returndto);
    }

    @PostMapping("/message2")
    public ResponseEntity testApi2(@RequestBody testDto testdto){
        returnDto returndto = testservice.testService(testdto);
        return ResponseEntity.status(HttpStatus.OK).body(returndto);
    }

    @PostMapping("/message3")
    public ResponseEntity testApi3(@RequestBody testDto testdto){
        returnDto returndto = testservice.testService(testdto);
        return ResponseEntity.status(HttpStatus.OK).body(returndto);
    }
}
