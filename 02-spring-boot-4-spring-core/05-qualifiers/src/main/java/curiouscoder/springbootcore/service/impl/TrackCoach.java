package curiouscoder.springbootcore.service.impl;

import curiouscoder.springbootcore.service.Coach;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

    public TrackCoach() {
        System.out.println("TrackCoach: no-arg constructor");
    }
    @Override
    public String getDailyWorkout() {
        return "Run a Hard 5K!!!";
    }

}
