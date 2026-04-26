package curiouscoder.restcrud.dao;

import curiouscoder.restcrud.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee save(Employee entity);

    Employee findById(Integer id);

    void deleteById(Integer id);

}
