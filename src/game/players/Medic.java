package game.players;

public class Medic extends Hero {
    private int healPoints;
    private boolean isBoosted = false;


    public Medic(int health, int damage, String name, int healPoints) {
        super(health, damage, name, SuperAbility.HEAL);
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int actualHeal = this.healPoints;

        if (isBoosted) {
            actualHeal *= 2;
            isBoosted = false;
            System.out.println("Medic uses boosted heal: " + actualHeal);
        }

        for (Hero hero : heroes) {
            if (hero.getHealth() > 0 && this != hero) {
                hero.setHealth(hero.getHealth() + actualHeal);
            }
        }
    }

    public void setBoosted(boolean boosted) {
        isBoosted = boosted;
    }
}
