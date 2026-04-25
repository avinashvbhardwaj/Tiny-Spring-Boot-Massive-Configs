package curiouscoder.springbootcrud.dao.impl;

import curiouscoder.springbootcrud.dao.StudentDAO;
import curiouscoder.springbootcrud.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {

    //define fields for entity manager
    private final EntityManager entityManager;

    // inject entity manager using constructor
    // only one construction no need for autowired
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //implement ave method
    @Override
    @Transactional
    public void save(Student entity) {
        entityManager.persist(entity);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll(){
        //create query
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student order by lastName, firstName desc", Student.class);

        //return a query result
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        //create query
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE lastName=:lastName", Student.class);
        theQuery.setParameter("lastName", lastName);
        //return a query result
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student theStudent) {
        Student updatedStudent = entityManager.merge(theStudent);
        System.out.println("updatedStudent: " + updatedStudent);
    }

}
