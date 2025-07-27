package hw_7.templates;

public class Magic extends Hero {
    @Override
    public void applySuperAbility() {
        super.applySuperAbility();
        System.out.println("Magic применил супер способность " + getSuperAbilityType());
    }
}
