package game.players;

import game.general.RPG_Game;

public class Druid extends Hero {
    public boolean helperGiven = false;

    public Druid(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BLOCK_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (!helperGiven) {
            helperGiven = true;
            boolean helperAngel = RPG_Game.random.nextBoolean();

            if (helperAngel) {
                for (Hero hero : heroes) {
                    if (hero instanceof Medic) {
                        Medic medic = (Medic) hero;
                        medic.setBoosted(true);
                        System.out.println("Druid summoned an Angel! Medic's healing is increased.");
                        break;
                    }
                }
            } else if ((double) boss.getHealth() / boss.getMaxHealth() < 0.5) {
                boss.setDamage((int) (boss.getDamage() * 1.5));
                System.out.println("Druid summoned a Raven! Boss's damage increased by 50%.");
            } else {
                System.out.println("Druid tried to summon Raven, but boss HP > 50%. Nothing happened.");
            }
        }
    }
}


