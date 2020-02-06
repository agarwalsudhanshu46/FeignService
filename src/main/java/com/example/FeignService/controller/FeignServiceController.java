package com.example.FeignService.controller;

import com.example.FeignService.client.FeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class FeignServiceController {

    @Autowired
    FeignClient employeeService;


    @GetMapping("/employee/{id}")
    public String getEmployeeName(@PathVariable(value = "id") int employeeId) {
        return employeeService.getEmployeeName(employeeId);
    }

}
