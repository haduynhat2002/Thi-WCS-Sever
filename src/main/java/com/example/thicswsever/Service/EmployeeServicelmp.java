package com.example.thicswsever.Service;

import com.example.thicswsever.Model.Employee;
import com.example.thicswsever.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServicelmp implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public void saveEmployee(Employee s) {
        employeeRepository.save(s);
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee findById(Integer id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public List<Employee> findAllByNameContainsIgnoreCase(String name) {
        return employeeRepository.findAllByNameContainsIgnoreCase(name);
    }


}
