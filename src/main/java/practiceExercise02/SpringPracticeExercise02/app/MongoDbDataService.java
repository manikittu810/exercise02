package practiceExercise02.SpringPracticeExercise02.app;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Primary
//@Component
@Repository //stereotype annotation
public class MongoDbDataService implements DataService{
    public int[] retrieveData(){
        return new int[] {1,2,3,4,5};
    }
}
