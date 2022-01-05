package com.torryharris.demo.controller;

import com.torryharris.demo.model.Department;
import com.torryharris.demo.model.Employee;
import com.torryharris.demo.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/deptlist")
    public List<Department> deptLists() {
        LOG.info("deptList");
        return departmentService.getAllDepartments();
    }
    @GetMapping("/dept/{deptid}")
    public Department getDeptById(@PathVariable(name = "deptid") int deptid){
        LOG.info("getDeptById"+deptid);
        return  departmentService.getDepartmentById(deptid);
    }
    @PostMapping("/addDept")
    public ResponseEntity<Department> addDeprt(@RequestBody Department department) {
        LOG.info("addDepartment " + department.toString());
        Department department1=departmentService.addDept(department);
        HttpHeaders headers = new HttpHeaders();
        headers.add("message", "Department added successfully.");
        HttpStatus status = HttpStatus.CREATED;
        return new ResponseEntity<Department>(department1, headers, status);
    }
    @DeleteMapping("/deletedept/{deptid}")
    public Department deleteDept(@PathVariable(name = "deptid") int deptid) {
        LOG.info("deleteDepartment " + deptid);
        return departmentService.deleteDept(deptid);
    }
}
