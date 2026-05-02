package curiouscoder.restcrud.service;

import java.util.List;

import curiouscoder.restcrud.model.Employee;

public interface EmployeeService {

    List<Employee> findAll();

    Employee save(Employee entity);

    Employee findById(Integer id);

    Employee deleteById(Integer id);
}
