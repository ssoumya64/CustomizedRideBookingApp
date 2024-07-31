package com.codingshuttle.project.uber.advice;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class ApiResponse<T> {
    @JsonFormat(pattern = "hh:mm:ss dd-MM-yyyy")
    private LocalDateTime timestamp;
    private T data;
    private ExceptionResponse error;

    public ApiResponse() {
        this.timestamp = LocalDateTime.now();
    }

    public ApiResponse(T data) {
        this();
        this.data = data;

    }

    public ApiResponse(ExceptionResponse error) {
        this();
        this.error = error;
    }
}
