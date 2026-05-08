package curiouscoder.springdoc.service;

import java.util.List;

import curiouscoder.springdoc.model.Employee;

public interface EmployeeService {

    List<Employee> findAll();

    Employee save(Employee entity);

    Employee findById(Integer id);

    void deleteById(Integer id);
}
