package Task_2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {
    @Bean
    public Quest slayDragonQuest() {
        return new Implementation_1();
    }

    @Bean
    public Quest rescuePrincessQuest() {
        return new Implementation_2();
    }

    @Bean
    public Knight knight(@Qualifier("slayDragonQuest") Quest quest) {
        return new Knight(quest);
    }
}
