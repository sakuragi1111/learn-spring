package ioc.xml;

public class Gun implements Weapon {
    @Override
    public void attack() {
        System.out.println("开枪");
    }
}
