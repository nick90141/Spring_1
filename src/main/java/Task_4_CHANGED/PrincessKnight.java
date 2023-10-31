package Task_4_CHANGED;

import Task_2.Quest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("princessKnight")
public class PrincessKnight implements Knight {
    private final Quest quest;

    @Autowired
    public PrincessKnight(@Qualifier("rescuePrincessQuest") Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        System.out.println("Начало");
        quest.embark();
        System.out.println("Конец");
    }
}