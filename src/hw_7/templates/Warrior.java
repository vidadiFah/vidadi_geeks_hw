package hw_7.templates;

public class Warrior extends Hero {
    @Override
    public void applySuperAbility() {
        super.applySuperAbility();
        System.out.println("Warrior применил супер способность " + getSuperAbilityType());
    }
}
