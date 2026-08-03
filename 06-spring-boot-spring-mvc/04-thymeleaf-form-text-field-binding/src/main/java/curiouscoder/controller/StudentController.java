package curiouscoder.controller;

import curiouscoder.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;

@Controller
public class StudentController {

    // a controller to show the input form
    @GetMapping("/showStudentForm")
    public String showForm(Model theModel) {

        Student theStudent = new Student();

        theStudent.setLastName("Bhardwa");

        theModel.addAttribute("student", theStudent);

        return "student-form";
    }

    // need a controller method to read form data and
    // add data to model
    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent, Model theModel) {
        System.out.println(theStudent.getFirstName() + " " + theStudent.getLastName());
        theModel.addAttribute("theDate", new Date());
        return "student-conformation";
    }

}
