package hw_7.templates;

public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    private String superAbilityType;

    public String getSuperAbilityType() {
        return superAbilityType;
    }

    public void setSuperAbilityType(String superAbilityType) {
        this.superAbilityType = superAbilityType;
    }

    @Override
    public void applySuperAbility() {}
}
