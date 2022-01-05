package com.torryharris.demo.service;

import com.torryharris.demo.exception.DepartmentAlreadyExistsException;
import com.torryharris.demo.model.Department;
import com.torryharris.demo.model.Employee;
import com.torryharris.demo.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    public List<Department> getAllDepartments() {
        LOG.info("getAllDepartments");
        return departmentRepository.findAll();
    }

    public Department getDepartmentById(int deptid) {
        LOG.info("getDepartmentById");
        return departmentRepository.findById(deptid).get();
    }

    public Department addDept(Department department) {
        LOG.info("addDept");
        if (!departmentRepository.existsById(department.getDepartmentId())) {
            return departmentRepository.save(department);
        } else
            throw new DepartmentAlreadyExistsException();
    }

    public Department deleteDept(int deptid) {
        LOG.info("deleteDepartment " + deptid);
        departmentRepository.deleteById(deptid);
        return null;
    }
}



