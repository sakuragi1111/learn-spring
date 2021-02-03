package ioc.xml;

public class Sword implements Weapon {
    @Override
    public void attack() {
        System.out.println("刀");
    }
}
