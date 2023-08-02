package com.dgmf.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/employee")
@CrossOrigin
@RequiredArgsConstructor
public class EmployeeController {
    @PostMapping
    public String saveEmployee() {

    }
}
