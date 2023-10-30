package Task_4_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);

        User user = context.getBean(User.class);

        System.out.println("Sex: " + user.getSex());
        System.out.println("Age: " + user.getAge());
        System.out.println("Status: " + user.getStatus());

        context.close();
    }
}