package curiouscoder.springbootcrud;

import curiouscoder.springbootcrud.dao.StudentDAO;
import curiouscoder.springbootcrud.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootcrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootcrudApplication.class, args);
	}

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
        return runner -> {
//            createStudent(studentDAO);
            createMultipleStudent(studentDAO);
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

}
