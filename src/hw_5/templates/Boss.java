package hw_5.templates;

public class Boss {
    private int health;
    private int damage;
    private String bossDefence;

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getBossDefence() {
        return bossDefence;
    }

    public void setHealth(int health) {
        if (health < 0) {
            System.out.println("Wrong value for health. It must be positive number.");
        } else {
            this.health = health;
        }
    }

    public void setDamage(int damage) {
        if (damage < 0) {
            System.out.println("Wrong value for damage. It must be positive number.");
        } else {
            this.damage = damage;
        }
    }

    public void setBossDefence(String bossDefence) {
        if (bossDefence.isEmpty()) {
            this.bossDefence = bossDefence;
            }
    }

}
