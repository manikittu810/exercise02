package practiceExercise02.SpringPracticeExercise02.app;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("package practiceExercise02.SpringPracticeExercise02.app")
public class MySQLDataService implements DataService{
    public int[] retrieveData(){
        return new int[] {200,300,400,500,23,45};
    }
}
