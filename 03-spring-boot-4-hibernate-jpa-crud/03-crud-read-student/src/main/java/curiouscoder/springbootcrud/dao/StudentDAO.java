package curiouscoder.springbootcrud.dao;

import curiouscoder.springbootcrud.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student entity);

    Student findById(Integer id);

}
