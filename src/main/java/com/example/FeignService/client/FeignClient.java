package com.example.FeignService.client;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@org.springframework.cloud.openfeign.FeignClient(name="EmployeeService", url = "http://localhost:8080")
public interface FeignClient {

    @GetMapping("/api/v1/employee/{id}")
    public String getEmployeeName(@PathVariable(value = "id") int employeeId) ;

}
