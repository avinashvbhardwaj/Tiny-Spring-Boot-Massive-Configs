package curiouscoder.springbootrest.rest;

import curiouscoder.springbootrest.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    // define endpoint for "/students" - return a list of students
    @GetMapping("/students")
    public List<Student> getStudents(){

        List<Student> theStudents = new ArrayList<>();
        theStudents.add(new Student("Avinash", "Bhardwaj"));
        theStudents.add(new Student("Shubham", "Tiwari"));
        theStudents.add(new Student("Mahesh", "Hanwatkar"));

        return theStudents;
    }
}
