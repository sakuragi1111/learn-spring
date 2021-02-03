package ioc.annotation;

import org.springframework.stereotype.Component;

@Component
public class Axe implements Weapon {
    @Override
    public void attack() {
        System.out.println("斧子");
    }
}
