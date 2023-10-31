package Task_2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("rescuePrincessQuest")
public class RescuePrincessQuest implements Quest {
    @Override
    public void embark() {

    }
}