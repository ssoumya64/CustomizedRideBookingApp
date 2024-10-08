package com.codingshuttle.project.uber.advice;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.List;
@Data
@Builder
public class ExceptionResponse {
    private HttpStatus status;
    private String message;
    private List<String> suberror;
}
