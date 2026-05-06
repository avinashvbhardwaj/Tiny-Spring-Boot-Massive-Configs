package curiouscoder.restcrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import curiouscoder.restcrud.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // that's it no need to write any code!!!
}
