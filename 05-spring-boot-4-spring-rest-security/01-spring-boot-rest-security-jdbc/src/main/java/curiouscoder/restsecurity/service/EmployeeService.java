package curiouscoder.restsecurity.service;

import java.util.List;

import curiouscoder.restsecurity.model.Employee;

public interface EmployeeService {

    List<Employee> findAll();

    Employee save(Employee entity);

    Employee findById(Integer id);

    void deleteById(Integer id);
}
