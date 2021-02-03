package ioc.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BattleField {
    public static void main(String[] args) {
        battle1();
    }

    private static void battle1() {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        Human human1 = (Human) applicationContext.getBean("human");
        Human human2 = (Human) applicationContext.getBean("human");

        Orc orc1 = applicationContext.getBean(Orc.class);
        Orc orc2 = applicationContext.getBean(Orc.class);

        human1.attack();
        orc1.attack();
        human2.attack();
        orc2.attack();
    }
}
