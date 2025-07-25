package hw_6.templates;

public class Weapon {
    private WeaponType weaponType;
    private String weaponName;

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
}
