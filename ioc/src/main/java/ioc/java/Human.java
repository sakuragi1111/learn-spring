package ioc.java;

import javax.annotation.PostConstruct;

public class Human {
    private Weapon weapon;

    public Human() {
    }

    @PostConstruct
    private void init() {
        System.out.println("Human created!");
    }

    public Human(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        weapon.attack();
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
