package curiouscoder.springbootcore.service.impl;

import curiouscoder.springbootcore.service.Coach;

public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("SwimCoach: no-arg constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up!!!";
    }
}
