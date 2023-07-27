package practiceExercise02.SpringPracticeExercise02.app;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MongoDbDataService implements DataService{
    public int[] retrieveData(){
        return new int[] {1,2,3,4,5};
    }
}
