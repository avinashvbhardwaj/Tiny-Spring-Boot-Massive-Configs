package curiouscoder.springbootcore.rest;

import curiouscoder.springbootcore.service.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach cricketCoach;

    private Coach gymCoach;

    @Autowired
      public void setCoach(Coach cricketCoach) {
        this.cricketCoach = cricketCoach;
    }
    @Autowired
    public void doSomeStuff(Coach gymCoach) {
        this.gymCoach = gymCoach;
    }

    @GetMapping("cricket/getDailyWorkout")
    public String getCricketDailyWorkout(){
        return cricketCoach.getDailyWorkout();
    }

    @GetMapping("gym/getDailyWorkout")
    public String getGymDailyWorkout(){
        return gymCoach.getDailyWorkout();
    }
}
