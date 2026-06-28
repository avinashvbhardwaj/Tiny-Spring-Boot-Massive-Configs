package curiouscoder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
public class HelloWorldController {

    // a controller to show the input form
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    // a controller to process the output form
    @RequestMapping("/processForm")
    public String processForm(Model theModel){
        theModel.addAttribute("theDate", LocalDateTime.now());
        return "helloworld-process";
    }

}
