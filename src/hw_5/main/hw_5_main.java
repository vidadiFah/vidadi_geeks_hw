package hw_5.main;

import hw_5.templates.Boss;
import hw_5.templates.Hero;

public class hw_5_main {
    public static Hero[] createHeroes(){
        Hero physical = new Hero(280, 20, "Physical");
        Hero magic = new Hero(270, 15, "Magical");
        Hero kinetic = new Hero(250, 10);

        return new Hero[] {physical, magic, kinetic};
    }

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setBossDefence("Magic");

        System.out.println("BOSS HEALTH: " + boss.getHealth() +
                            " BOSS DAMAGE: " + boss.getDamage() +
                            " BOSS DAMAGE: " + boss.getBossDefence());

        Hero[] heroes = createHeroes();
        for (Hero obj : heroes) {
            System.out.println("HERO HEALTH: " + obj.getHealth() +
                    " HERO DAMAGE: " + obj.getDamage() +
                    " HERO ABILITY: " + obj.getAbility());
        }
    }
}
