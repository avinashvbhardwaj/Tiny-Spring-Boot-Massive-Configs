package curiouscoder.springbootcore.service.impl;

import curiouscoder.springbootcore.service.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("TennisCoach: no-arg constructor");
    }
	
	// define our init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In TennisCoach doMyStartupStuff():" + getClass().getSimpleName());
    }

    //define our destroy method
    // this will not run because scope defined as prototype
    //The client code must clean up prototype-scoped objects and release expensive resources that the prototype bean(s) are holding.
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In TennisCoach doMyCleanupStuff():" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

}
