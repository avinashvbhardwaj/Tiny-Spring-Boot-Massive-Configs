package curiouscoder.springbootcore.service.impl;

import curiouscoder.springbootcore.service.Coach;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    public BaseballCoach() {
        System.out.println("BaseballCoach: no-arg constructor");
    }
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice";
    }

}
