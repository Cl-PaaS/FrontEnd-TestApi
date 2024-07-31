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
    @PostMapping("/message")
    public ResponseEntity testApi(@RequestBody testDto testdto){
        returnDto returndto = testservice.testService(testdto);
        //return 한다.
        return ResponseEntity.status(HttpStatus.OK).body(returndto);
    }


}
