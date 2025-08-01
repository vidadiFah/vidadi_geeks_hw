package game.players;

import game.general.RPG_Game;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (RPG_Game.getRoundNumber() < 5) {
            boolean boosted = false;
            int boost = RPG_Game.random.nextInt(2, 4);
            for (Hero hero : heroes) {
                if (hero.getHealth() > 0 && this != hero) {
                    hero.setDamage(hero.getDamage() * boost);
                    boosted = true;
                }
            }
            if(boosted){
                System.out.println("Magic " + this.getName() + " boosted team damage by " + boost + "x");
            }
        }
    }
}
