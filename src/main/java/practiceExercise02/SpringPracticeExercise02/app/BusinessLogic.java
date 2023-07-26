package practiceExercise02.SpringPracticeExercise02.app;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;

//@Component
@Service //Stereotype annotations
public class BusinessLogic {
    private DataService dataService;

    public BusinessLogic(@Qualifier("package practiceExercise02.SpringPracticeExercise02.app")DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
