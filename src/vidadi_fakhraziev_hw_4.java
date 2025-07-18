import java.util.Objects;
import java.util.Random;

public class vidadi_fakhraziev_hw_4 {
    public static int bossHealth = 1500;
    public static int bossDamage = 50;
    public static int medicHeal = 20;
    public static String bossDefence;
    public static int[] heroesHealth = {280, 270, 250, 1000, 240, 350, 160, 200};
    public static int[] heroesDamage = {20, 15, 10, 5, 0, 0, 0, 0};
    public static String[] heroesAttackType = {"Physical", "Magical", "Kinetic", "Golem", "Medic", "Lucky", "Witcher", "Thor"};
    public static int damagers = 4;
    public static int roundNumber;
    static Random random = new Random();

    public static void main(String[] args) {
        printStatistics();
        while (!isGameOver()) {
            playRound();
        }
    }

    public static boolean isGameOver() {
        if (bossHealth <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }
        boolean allHeroesDead = true;
        for (int health : heroesHealth) {
            if (health > 0) {
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead) {
            System.out.println("Boss won!!!");
            return true;
        }
        return false;
    }

    public static void chooseBossDefence() {
        int randomIndex = random.nextInt(damagers);
        bossDefence = heroesAttackType[randomIndex];
    }

    public static void playRound() {
        roundNumber++;
        chooseBossDefence();
        bossAttack();
        heroesAttack();
        medicAbility();
        printStatistics();
    }

    public static void medicAbility(){
        int medicHealth = 0;
        for (int i = 0; i < heroesAttackType.length; i++) {
            if(Objects.equals(heroesAttackType[i], "Medic")){
                medicHealth = heroesHealth[i];
                break;
            }
        }
        if(roundNumber != 0) {
            for (int i = 0; i < heroesHealth.length; i++) {
                int randomIndex = random.nextInt(heroesHealth.length);
                if (heroesHealth[randomIndex] > 0 && heroesHealth[randomIndex] < 100 && medicHealth > 0 && !Objects.equals(heroesAttackType[randomIndex], "Medic")) {
                    heroesHealth[randomIndex] += medicHeal;
                    System.out.println("Medic healed: " + heroesAttackType[randomIndex]);
                    break;
                } else {
                    continue;
                }
            }
        }
    }

    public static void heroesAttack() {
        for (int i = 0; i < heroesDamage.length; i++) {
            if (heroesHealth[i] > 0 && bossHealth > 0) {
                int damage = heroesDamage[i];
                if (bossDefence == heroesAttackType[i]) {
                    int coeff = random.nextInt(2, 6);
                    damage *= coeff;
                    System.out.println("Critical damage: " + damage);
                }
                bossHealth -= damage;
                if (bossHealth < 0) {
                    bossHealth = 0;
                }
            }
        }
    }

    public static void bossAttack() {
        // Способность голема реализована в этом методе
        // Способность Lucky реализована в этом методе
        int golemIndex = -1;
        int luckyIndex = -1;
        for (int i = 0; i < heroesAttackType.length; i++) {
            if (Objects.equals(heroesAttackType[i], "Golem")) {
                golemIndex = i;
            }
            if (Objects.equals(heroesAttackType[i], "Lucky")) {
                luckyIndex = i;
            }
        }

        int totalDamageToGolem = 0;
        double coef = 0.2;
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesHealth[i] <= 0) {
                continue;
            }

            if (i == luckyIndex) {
                int dodgeChance = random.nextInt(4);
                if (dodgeChance == 0) {
                    System.out.println("Lucky dodged the attack!!!");
                    continue;
                }
            }

            int damageToHero = bossDamage;
            if (golemIndex != -1 && heroesHealth[golemIndex] > 0 && i != golemIndex) {
                int absorbed = (int) Math.round(bossDamage * coef);
                damageToHero -= absorbed;
                totalDamageToGolem += absorbed;
            }

            if(heroesHealth[i] - damageToHero < 0) {
                heroesHealth[i] = 0;
            } else {
                heroesHealth[i] -= damageToHero;
            }
        }

        if (golemIndex != -1 && heroesHealth[golemIndex] > 0) {
            heroesHealth[golemIndex] -= totalDamageToGolem;
            if(heroesHealth[golemIndex] < 0) {
                heroesHealth[golemIndex] = 0;
            }
            System.out.println("Golem absorbed " + totalDamageToGolem + " damage");
        }
    }

    public static void printStatistics() {
        System.out.println("ROUND " + roundNumber + " ----------------");
        System.out.println("Boss health: " + bossHealth + " damage: " + bossDamage
                + " defence: " +
                (bossDefence == null ? "No defence" : bossDefence));
        for (int i = 0; i < heroesHealth.length; i++) {
            if(heroesDamage[i] > 0) {
                System.out.println(heroesAttackType[i]
                        + " health: " + heroesHealth[i]
                        + " damage: " + heroesDamage[i]);
            } else {
                System.out.println(heroesAttackType[i]
                        + " health: " + heroesHealth[i]);
            }
        }
    }
}
