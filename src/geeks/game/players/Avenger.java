package geeks.game.players;

import geeks.game.general.RPG_Game;

public class Avenger extends Hero {
    public static boolean goodChance = false;

    public Avenger(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.DAMAGE_BLOCK);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int chance = RPG_Game.random.nextInt(5);
        if (chance == 0) {
            RPG_Game.setBlockAllDamage(true);
            System.out.println("Avenger " + this.getName() + " blocked all team damage this round!");
        }
    }
}
