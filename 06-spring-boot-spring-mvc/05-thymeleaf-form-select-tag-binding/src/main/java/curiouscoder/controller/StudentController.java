package curiouscoder.controller;

import curiouscoder.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;
import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    // a controller to show the input form
    @GetMapping("/showStudentForm")
    public String showForm(Model theModel) {

        Student theStudent = new Student();

        theStudent.setLastName("Bhardwaj");

        // if below does not match from a drop-down list then first value will be selected
//        theStudent.setCountry("INDIA");

        theModel.addAttribute("student", theStudent);

        return "student-form";
    }

    @GetMapping("/showStudentFormList")
    public String showFormList(Model theModel) {

        Student theStudent = new Student();

        theStudent.setLastName("Bhardwaj");

        // if below does not match from a drop-down list then first value will be selected
//        theStudent.setCountry("INDIA");
        System.out.println(countries);

        theModel.addAttribute("countries", countries);

        theModel.addAttribute("student", theStudent);

        return "student-form-list";
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
