package curiouscoder.springbootcore.service.impl;

import curiouscoder.springbootcore.service.Coach;
import org.springframework.stereotype.Component;

@Component
public class GymCoach implements Coach {

    public GymCoach() {
        System.out.println("GymCoach: no-arg constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Do 30 minutes of muscle training Daily!!!";
    }
}
