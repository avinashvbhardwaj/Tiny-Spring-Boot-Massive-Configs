package curiouscoder.restcrud.dao;

import java.util.List;

import curiouscoder.restcrud.model.Employee;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee save(Employee entity);

    Employee findById(Integer id);

    Employee deleteById(Integer id);

}
