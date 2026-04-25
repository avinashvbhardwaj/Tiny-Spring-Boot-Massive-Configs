package curiouscoder.springbootcrud.dao;

import curiouscoder.springbootcrud.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student entity);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String lastName);

    void update(Student theStudent);

    void delete(Integer id);

    int deleteAll();

}
