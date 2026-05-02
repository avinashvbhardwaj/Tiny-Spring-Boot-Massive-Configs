package curiouscoder.restcrud.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import curiouscoder.restcrud.dao.EmployeeDAO;
import curiouscoder.restcrud.model.Employee;
import jakarta.persistence.EntityManager;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

    private final EntityManager entityManager;

    @Autowired
    public EmployeeDAOJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        return entityManager.createQuery("FROM Employee", Employee.class).getResultList();
    }

    @Override
    public Employee findById(Integer id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public Employee save(Employee theStudent) {
        return entityManager.merge(theStudent);
    }

    @Override
    public Employee deleteById(Integer id) {
        System.out.println("deleting id " + id);
        // retrieve the student
        Employee theStudent = findById(id);

        // display the student
        System.out.println(theStudent);

        // delete the student
        entityManager.remove(theStudent);
        System.out.println("removed id " + id);

        return theStudent;
    }
}
