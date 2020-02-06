package com.example.FeignService.ExceptionHandler;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import feign.FeignException;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;

import java.util.Objects;

@RestControllerAdvice
public class FeignExceptionHandler {



    @ExceptionHandler(FeignException.class)
    public ErrorResponse handleFeignException(FeignException feignException, WebRequest webRequest){
        String requestPath = ((ServletWebRequest) webRequest).getRequest().getRequestURI();


        JSONObject jsonObject = new JSONObject(feignException.contentUTF8());
      if(Objects.nonNull(jsonObject.get("message"))) {
          String errorMessage = jsonObject.get("message").toString();
          ErrorResponse errorResponse = new ErrorResponse(errorMessage,
                  HttpStatus.PRECONDITION_FAILED.value(), "employeeService", requestPath);
          return errorResponse;
      }
       return null;

    }




}
