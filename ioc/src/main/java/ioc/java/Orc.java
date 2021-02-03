package ioc.java;

import javax.annotation.PostConstruct;

public class Orc {
    private Weapon weapon;

    public Orc() {
    }

    @PostConstruct
    private void init() {
        System.out.println("Orc created!");
    }

    public Orc(Weapon weapon) {
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
