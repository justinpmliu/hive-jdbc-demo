package com.example.hivedemo.controller;

import com.example.hivedemo.mapper.hive.EmployeeMapper;
import com.example.hivedemo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeMapper employeeMapper;

    @GetMapping
    public List<Employee> getAll() {
        return employeeMapper.findAll();
    }
}
