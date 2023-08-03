package com.dgmf.controller;

import com.dgmf.dto.EmployeeDTO;
import com.dgmf.entity.Employee;
import com.dgmf.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employee")
@CrossOrigin
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping("/save")
    public String saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
        Employee employee = employeeService.saveEmployee(employeeDTO);

        System.out.println("The employee \"" + employee.getEmployeeName()
                + "\" was successfully added");

        return "The employee \"" + employee.getEmployeeName()
                + "\" was successfully added";
    }
}
