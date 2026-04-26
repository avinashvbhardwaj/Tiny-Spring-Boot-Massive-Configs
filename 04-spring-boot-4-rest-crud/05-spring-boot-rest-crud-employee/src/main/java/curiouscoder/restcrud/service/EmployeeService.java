package curiouscoder.restcrud.service;

import curiouscoder.restcrud.Employee;
import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee save(Employee entity);

    Employee findById(Integer id);

    void deleteById(Integer id);
}
