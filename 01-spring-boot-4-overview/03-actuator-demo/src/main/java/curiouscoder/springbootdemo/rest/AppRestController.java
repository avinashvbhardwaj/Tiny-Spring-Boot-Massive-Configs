package curiouscoder.springbootdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {

    //expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!!!";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a Hard 5K!!!";
    }

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is a lucky day!!!!";
    }
}
