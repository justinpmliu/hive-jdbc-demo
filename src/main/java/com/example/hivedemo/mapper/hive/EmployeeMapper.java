package com.example.hivedemo.mapper.hive;

import com.example.hivedemo.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeMapper {

    List<Employee> findAll();
}
