package old;

public class BattleField {
    public static void main(String[] args) {
        battleWithoutFactory();
        battleWithFactory();
    }
    private static void battleWithoutFactory() {
        Human human1 = new Human(new Sword());
        Human human2 = new Human(new Sword());

        Orc orc1 = new Orc(new Axe());
        Orc orc2 = new Orc(new Axe());

        human1.attack();
        orc1.attack();
        human2.attack();
        orc2.attack();
    }

    private static void battleWithFactory() {
        Human human1 = new Human(WeaponFactory.getHumanWeapon());
        Human human2 = new Human(WeaponFactory.getHumanWeapon());

        Orc orc1 = new Orc(WeaponFactory.getOrcWeapon());
        Orc orc2 = new Orc(WeaponFactory.getOrcWeapon());

        human1.attack();
        orc1.attack();
        human2.attack();
        orc2.attack();
    }
}
