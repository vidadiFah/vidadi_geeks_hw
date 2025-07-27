package hw_7.templates;

public class Medic extends Hero{
    private double healPoints;

    public void increaseExperience(){
        healPoints *= 1.1;
    }

    @Override
    public void applySuperAbility() {
        super.applySuperAbility();
        System.out.println("Medic применил супер способность " + getSuperAbilityType());
    }
}
