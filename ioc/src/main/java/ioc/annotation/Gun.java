package ioc.annotation;

import org.springframework.stereotype.Component;

@Component
public class Gun implements Weapon {
    @Override
    public void attack() {
        System.out.println("开枪");
    }
}
