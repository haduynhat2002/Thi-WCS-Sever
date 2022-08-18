package com.example.thicswsever.Repository;

import com.example.thicswsever.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findAllByName(String name);
    List<Employee> findAllByNameContainsIgnoreCase(String name);
}
