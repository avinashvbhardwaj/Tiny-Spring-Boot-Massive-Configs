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
            createStudent(studentDAO);
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

}
