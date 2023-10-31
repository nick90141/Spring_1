package Task_4_CHANGED;

import Task_2.Implementation_1;
import Task_2.Implementation_2;
import Task_2.Quest;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "Task_2")
public class KnightConfig {
    @Bean
    @Qualifier("dragonKnight")
    public Knight slayDragonKnight(@Qualifier("slayDragonQuest") Quest quest) {
        return new DragonKnight(quest);
    }

    @Bean
    @Qualifier("princessKnight")
    public Knight rescuePrincessKnight(@Qualifier("rescuePrincessQuest") Quest quest) {
        return new PrincessKnight(quest);
    }


}
