package Task_4_CHANGED;

import Task_2.Quest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("dragonKnight")
public class DragonKnight implements Knight {
    private final Quest quest;

    @Autowired
    public DragonKnight(@Qualifier("slayDragonQuest") Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        System.out.println("Начало");
        quest.embark();
        System.out.println("Конец");
    }
}