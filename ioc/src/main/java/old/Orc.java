package old;

public class Orc {
    private Weapon weapon;

    public Orc(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        weapon.attack();
    }
}
