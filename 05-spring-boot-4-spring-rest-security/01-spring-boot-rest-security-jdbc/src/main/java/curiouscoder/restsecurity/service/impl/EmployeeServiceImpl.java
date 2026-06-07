package curiouscoder.restsecurity.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curiouscoder.restsecurity.dao.EmployeeRepository;
import curiouscoder.restsecurity.model.Employee;
import curiouscoder.restsecurity.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    // remove @Transactional because JpaRepository provides that by-default
    @Override
    public Employee save(Employee entity) {
        return employeeRepository.save(entity);
    }

    @Override
    public Employee findById(Integer id) {
        Optional<Employee> result = employeeRepository.findById(id);
        return result.isPresent() ? result.get() : null;
    }

    // remove @Transactional because JpaRepository provides that by-default
    @Override
    public void deleteById(Integer id) {
        employeeRepository.deleteById(id);
    }
}
