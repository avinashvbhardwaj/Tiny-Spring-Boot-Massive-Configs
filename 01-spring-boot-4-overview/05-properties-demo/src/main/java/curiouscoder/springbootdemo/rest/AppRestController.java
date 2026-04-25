package curiouscoder.springbootdemo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {


	//inject properties for: coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    //expose end point for team info
    @GetMapping("/teamInfo")
    public String teamInfo(){
        return "{\"Coach\":\"" + coachName + "\", \"Team\":\"" + teamName + "\"}";
    }

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
