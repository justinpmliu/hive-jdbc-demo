package com.example.hivedemo.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Employee {
    private Integer employeeId;
    private String fullName;
    private String positionTitle;
    private Date birthDate;
    private Date hireDate;
    private BigDecimal salary;
    private String managementRole;
    private String departmentDesc;
}
