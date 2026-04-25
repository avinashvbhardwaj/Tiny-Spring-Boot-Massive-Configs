package curiouscoder.springbootcore.service.impl;

import curiouscoder.springbootcore.service.Coach;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("TennisCoach: no-arg constructor");
    }
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

}
