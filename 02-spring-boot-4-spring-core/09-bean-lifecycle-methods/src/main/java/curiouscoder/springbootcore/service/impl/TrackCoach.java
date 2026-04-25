package curiouscoder.springbootcore.service.impl;

import curiouscoder.springbootcore.service.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TrackCoach implements Coach {

    public TrackCoach() {
        System.out.println("TrackCoach: no-arg constructor");
    }
	
	// define our init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In TrackCoach doMyStartupStuff():" + getClass().getSimpleName());
    }

    //define our destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In TrackCoach doMyCleanupStuff():" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run a Hard 5K!!!";
    }

}
