package hw_6.templates;

public class Boss extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo() {
        return "HEALTH: " + this.getHealth() + " DAMAGE: "
                + this.getDamage() + " WEAPON: " + weapon.getWeaponType() + " " + weapon.getWeaponName();
    }
}
