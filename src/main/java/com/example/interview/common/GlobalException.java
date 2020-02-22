package com.example.interview.common;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(value = Exception.class)
    public HttpResult exception(Exception e, HttpServletRequest request){
        return HttpResult.builder().code(500).msg("error").build();
    }
}
