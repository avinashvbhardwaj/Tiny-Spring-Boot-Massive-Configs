package curiouscoder.springbootcrud;

import curiouscoder.springbootcrud.dao.StudentDAO;
import curiouscoder.springbootcrud.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringbootcrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootcrudApplication.class, args);
	}

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
        return runner -> {
//            createStudent(studentDAO);
//            createMultipleStudent(studentDAO);
//            readStudent(studentDAO);
//            queryForStudents(studentDAO);
            queryForStudentsByLastName(studentDAO);
        };
    }

    private void createStudent(StudentDAO studentDAO) {
        //create the student object
        System.out.println("Creating new Student object ...");
        Student student = new Student("Avinash", "Bhardwaj", "avinash@curiouscoder.com");

        //save the student object
        System.out.println("Saving the Student");
        studentDAO.save(student);

        //display the student id
        System.out.println("Saved student. Generated id: " + student.getId());

    }

    private void createMultipleStudent(StudentDAO studentDAO) {
        //create multiple student object
        System.out.println("Creating 3 Student object ...");
        Student student1 = new Student("Agastya", "Bhardwaj", "agastya@curiouscoder.com");
        Student student2 = new Student("Shubham", "Tiwari", "shubham@curiouscoder.com");
        Student student3 = new Student("Mahesh", "Hanwatkar", "mahesh@curiouscoder.com");

        //save the student objects
        System.out.println("Saving the Students ...");
        studentDAO.save(student1);
        studentDAO.save(student2);
        studentDAO.save(student3);

        //display the student ids
        System.out.println("Saved student1. Generated id: " + student1.getId());
        System.out.println("Saved student2. Generated id: " + student2.getId());
        System.out.println("Saved student3. Generated id: " + student3.getId());
    }

    private void readStudent(StudentDAO studentDAO) {
        //create the student object
        System.out.println("Creating new Student object ...");
        Student entity = new Student("Avinash", "Bhardwaj", "avinash@curiouscoder.com");

        //save the student object
        System.out.println("Saving the Student");
        studentDAO.save(entity);

        //display the student id
        System.out.println("Saved student. Generated id: " + entity.getId());

        //Reading the Student Object by id
        Student byId = studentDAO.findById(entity.getId());
        System.out.println("Student " + byId);
    }

    private void queryForStudents(StudentDAO studentDAO) {

        System.out.println("Displaying all students");
        // get a list of Students
        List<Student> theStudents = studentDAO.findAll();

        // display list of students
        for(Student student : theStudents){
            System.out.println(student);
        }

    }

    private void queryForStudentsByLastName(StudentDAO studentDAO) {
        // get a list of Students by lastName
        List<Student> theStudents = studentDAO.findByLastName("Bhardwaj");

        // display list of students
        for(Student student : theStudents){
            System.out.println(student);
        }
    }

}
