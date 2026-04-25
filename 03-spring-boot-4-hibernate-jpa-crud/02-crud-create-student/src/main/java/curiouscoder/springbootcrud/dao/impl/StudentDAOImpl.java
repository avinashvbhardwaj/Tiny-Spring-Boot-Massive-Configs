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

}
