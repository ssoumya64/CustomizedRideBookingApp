package com.codingshuttle.project.uber.advice;

import com.codingshuttle.project.uber.Exceptions.ResourceNotFoundException;
import com.codingshuttle.project.uber.Exceptions.RuntimeConflictException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
   public ResponseEntity<ApiResponse<?>> handelResourceNotFoundException(ResourceNotFoundException exception){
    ExceptionResponse build = ExceptionResponse.builder().status(HttpStatus.NOT_FOUND).message(exception.getMessage()).build();
   return buildErrorResponseEntity(build);
}

    @ExceptionHandler(RuntimeConflictException.class)
    public ResponseEntity<ApiResponse<?>> handelRuntimeconflictException(RuntimeConflictException exception){
        ExceptionResponse build = ExceptionResponse.builder().status(HttpStatus.CONFLICT).message(exception.getMessage()).build();
        return buildErrorResponseEntity(build);
    }
@ExceptionHandler(Exception.class)
public ResponseEntity<ApiResponse<?>> handelInternalServerError(Exception ex){
    ExceptionResponse build = ExceptionResponse.builder().status(HttpStatus.INTERNAL_SERVER_ERROR).message(ex.getMessage()).build();
    return buildErrorResponseEntity(build);
}

public ResponseEntity<ApiResponse<?>> buildErrorResponseEntity(ExceptionResponse build){
return new ResponseEntity<>(new ApiResponse<>(build),build.getStatus());
}
}
