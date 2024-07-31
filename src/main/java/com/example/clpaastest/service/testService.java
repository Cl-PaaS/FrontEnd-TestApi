package com.example.clpaastest.service;

import com.example.clpaastest.dto.returnDto;
import com.example.clpaastest.dto.testDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class testService {

    public returnDto testService(testDto testdto){

        System.out.println(testdto.getUserId());
        System.out.println(testdto.getText());
        returnDto returndto = returnDto.builder()
                .userId(testdto.getUserId())
                .status(true)
                .build();

        //return 한다.
        return returndto;

    }

}
