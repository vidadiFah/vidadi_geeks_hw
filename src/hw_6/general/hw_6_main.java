package hw_6.general;

import hw_6.templates.Boss;
import hw_6.templates.Skeleton;
import hw_6.templates.Weapon;
import hw_6.templates.WeaponType;

public class hw_6_main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon();
        bossWeapon.setWeaponType(WeaponType.RIFLE);
        bossWeapon.setWeaponName("AK47");

        Boss boss = new Boss();
        boss.setHealth(1500);
        boss.setDamage(50);
        boss.setWeapon(bossWeapon);

        System.out.print("BOSS_INFO -> ");
        System.out.println(boss.printInfo());

        Weapon first_skeleton_weapon = new Weapon();
        first_skeleton_weapon.setWeaponType(WeaponType.BOW);
        first_skeleton_weapon.setWeaponName("ARROWS");

        Skeleton first_skeleton = new Skeleton();
        first_skeleton.setHealth(700);
        first_skeleton.setDamage(30);
        first_skeleton.setArrowAmount(30);
        first_skeleton.setWeapon(first_skeleton_weapon);

        System.out.print("FIRST_SKELETON_BOSS_INFO -> ");
        System.out.println(first_skeleton.printInfo());

        Weapon second_skeleton_weapon = new Weapon();
        second_skeleton_weapon.setWeaponType(WeaponType.BOW);
        second_skeleton_weapon.setWeaponName("ARROWS");

        Skeleton second_skeleton = new Skeleton();
        second_skeleton.setHealth(800);
        second_skeleton.setDamage(25);
        second_skeleton.setArrowAmount(20);
        second_skeleton.setWeapon(second_skeleton_weapon);

        System.out.print("SECOND_SKELETON_BOSS_INFO -> ");
        System.out.println(second_skeleton.printInfo());
    }
}
