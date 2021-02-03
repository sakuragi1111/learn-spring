package ioc.java;

import org.springframework.context.annotation.*;

@Configuration
public class AppConfig {
    @Bean
    public Weapon sword() {
        return new Sword();
    }

    @Bean
    public Weapon axe() {
        return new Axe();
    }

    @Bean
    public Weapon gun() {
        return new Gun();
    }

    // 如果有一个bean被设置为@DependsOn的目标，那么其上的@Lazy无效
    @Bean
    @DependsOn("orc")
    public Human human1() {
        return new Human(sword());
    }

    @Bean
    @Scope("prototype")
    public Human human2() {
        return new Human(gun());
    }

    @Bean
    @Lazy
    public Orc orc() {
        return new Orc(axe());
    }
}
