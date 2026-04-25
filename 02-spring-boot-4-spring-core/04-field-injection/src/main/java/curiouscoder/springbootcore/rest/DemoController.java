package curiouscoder.springbootcore.rest;

import curiouscoder.springbootcore.service.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private Coach cricketCoach;

    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout(){
        return cricketCoach.getDailyWorkout();
    }
}
