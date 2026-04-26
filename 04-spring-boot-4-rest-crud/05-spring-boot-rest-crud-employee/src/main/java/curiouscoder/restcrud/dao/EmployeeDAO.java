package curiouscoder.restcrud.dao;

import curiouscoder.restcrud.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
