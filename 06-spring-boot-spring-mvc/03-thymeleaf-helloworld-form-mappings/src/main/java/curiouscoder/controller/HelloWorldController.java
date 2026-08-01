package curiouscoder.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;

@Controller
public class HelloWorldController {

    // a controller to show the input form
    @GetMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    // need a controller method to read form data and
    // add data to model
    @RequestMapping("/processForm")
    public String processForm(HttpServletRequest request, Model theModel) {
        String name = request.getParameter("name");

        theModel.addAttribute("message", "Yo! " + name.toUpperCase());

        theModel.addAttribute("theDate", LocalDateTime.now());
        return "helloworld-process";
    }

    //
    @PostMapping("/processRequestParam")
    public String processRequestParam(@RequestParam("name") String name, Model theModel) {
        theModel.addAttribute("message", "Yo! " + name.toLowerCase());
        theModel.addAttribute("theDate", LocalDateTime.now());
        return "helloworld-param";
    }


}
