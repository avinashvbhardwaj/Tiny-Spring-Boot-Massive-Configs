package curiouscoder.springbootcore.service.impl;


import curiouscoder.springbootcore.service.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("CricketCoach: no-arg constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "30 minutes bowling with one stump!";
    }

    @Override
    public String getDailyFortune() {
        return "You have unlocked new skill : ";
    }

}
