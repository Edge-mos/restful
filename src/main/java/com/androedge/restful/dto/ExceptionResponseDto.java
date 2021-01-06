package com.androedge.restful.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ExceptionResponseDto {
    private LocalDateTime timeStamp;
    private String message;
    private String details;
}
