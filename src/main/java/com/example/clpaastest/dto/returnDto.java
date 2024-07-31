package com.example.clpaastest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class returnDto {
    private Long userId;
    private Boolean status;

}

