package old;

public class WeaponFactory {
    public static Weapon getHumanWeapon() {
        return new Gun();
    }

    public static Weapon getOrcWeapon() {
        return new Axe();
    }
}
