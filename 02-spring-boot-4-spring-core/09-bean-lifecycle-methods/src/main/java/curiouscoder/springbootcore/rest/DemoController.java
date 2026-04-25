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

    private Coach theTennisCoach;
    private Coach anotherTennisCoach;

    private Coach theTrackCoach;
    private Coach anotherTrackCoach;
    private Coach anotherOneTrackCoach;

//    @Autowired
//    public DemoController(@Qualifier("tennisCoach") Coach theTennisCoach, @Qualifier("tennisCoach") Coach anotherTennisCoach) {
//        this.theTennisCoach = theTennisCoach;
//        this.anotherTennisCoach = anotherTennisCoach;
//    }
//
//    @Autowired
//    public DemoController(@Qualifier("trackCoach") Coach theTrackCoach, @Qualifier("trackCoach") Coach anotherTrackCoach, @Qualifier("trackCoach") Coach anotherOneTrackCoach) {
//        this.theTrackCoach = theTrackCoach;
//        this.anotherTrackCoach = anotherTrackCoach;
//        this.anotherOneTrackCoach = anotherOneTrackCoach;
//    }

    @Autowired
    public void setTheTennisCoach(@Qualifier("tennisCoach")Coach theTennisCoach) {
        this.theTennisCoach = theTennisCoach;
    }
    @Autowired
    public void setAnotherTennisCoach(@Qualifier("tennisCoach")Coach anotherTennisCoach) {
        this.anotherTennisCoach = anotherTennisCoach;
    }
    @Autowired
    public void setTheTrackCoach(@Qualifier("trackCoach")Coach theTrackCoach) {
        this.theTrackCoach = theTrackCoach;
    }
    @Autowired
    public void setAnotherTrackCoach(@Qualifier("trackCoach")Coach anotherTrackCoach) {
        this.anotherTrackCoach = anotherTrackCoach;
    }
    @Autowired
    public void setAnotherOneTrackCoach(@Qualifier("trackCoach")Coach anotherOneTrackCoach) {
        this.anotherOneTrackCoach = anotherOneTrackCoach;
    }

    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout(){
        return theTennisCoach.getDailyWorkout();
    }

    /**
     * default scope is singleton on TennisCoach then true because same instance is shared while running
    */
    @GetMapping("/checkScopeTennis")
    public String checkScopeTennis() {
        return "Comparing Beans: theTennisCoach == anotherTennisCoach : \"" + (theTennisCoach == anotherTennisCoach) + "\"";
    }

    /**
     * scope is prototype on TrackCoach then false because multiple instances are there while running
     */
    @GetMapping("/checkScopeTrack")
    public String checkScopeTrack() {
        return "Comparing Beans: theTrackCoach == anotherTrackCoach : \"" + (theTrackCoach == anotherTrackCoach)
                + "\" theTrackCoach == anotherOneTrackCoach : \"" + (theTrackCoach == anotherOneTrackCoach) + "\"";
    }

    @GetMapping("/getDailyTrack")
    public String getDailyTrack(){
        return anotherOneTrackCoach.getDailyWorkout();
    }

}
