package Task_4_CHANGED;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);

//        Knight dragonKnight = context.getBean("dragonKnight", Knight.class);
//        Knight princessKnight = context.getBean("princessKnight", Knight.class);

//        dragonKnight.embarkOnQuest();
//        princessKnight.embarkOnQuest();
    }
}
