package curiouscoder.springbootcore.rest;

import curiouscoder.springbootcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final Coach coach;

    @Autowired
    public DemoController(Coach coach){
        this.coach = coach;
    }

    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout(){
        return coach.getDailyWorkout();
    }
}
