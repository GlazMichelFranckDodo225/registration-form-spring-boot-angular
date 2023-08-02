package com.dgmf.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
@Table(name = "tbl_employee")
public class Employee {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id")
    private Long employeeId;
    @Column(name = "employee_name", nullable = false, length = 30)
    private String employeeName;
    @Column(name = "employee_address")
    private String employeeAddress;
    @Column(name = "employee_mobile", length = 10)
    private String employeeMobile;
}
