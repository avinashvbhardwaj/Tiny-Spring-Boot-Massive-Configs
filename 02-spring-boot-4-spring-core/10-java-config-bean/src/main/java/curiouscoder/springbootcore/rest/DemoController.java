package curiouscoder.springbootcore.rest;

import curiouscoder.springbootcore.service.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Lazy
public class DemoController {

    private Coach swimCoach;

    @Autowired
    public void setSwimCoach(@Qualifier("swimCoach") Coach swimCoach) {
        this.swimCoach = swimCoach;
    }

     @GetMapping("/getDailyWorkout")
    public String getDailyWorkout(){
        return swimCoach.getDailyWorkout();
    }

}
