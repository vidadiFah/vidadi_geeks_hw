package hw_7.general;

import hw_7.templates.HavingSuperAbility;
import hw_7.templates.Magic;
import hw_7.templates.Medic;
import hw_7.templates.Warrior;

public class Main {
    public static void main(String[] args) {
        Magic magic = new Magic();
        magic.setSuperAbilityType("STRENGTHEN THE TEAM");

        Medic medic = new Medic();
        medic.setSuperAbilityType("SUPER HEALING");

        Warrior warrior = new Warrior();
        warrior.setSuperAbilityType("CRITICAL DAMAGE");

        HavingSuperAbility[] havingSuperAbilities = {warrior, magic, medic};
        for(HavingSuperAbility h : havingSuperAbilities){
            h.applySuperAbility();
            if(h instanceof Medic){
                ((Medic) h).increaseExperience();
            }
        }
    }
}
