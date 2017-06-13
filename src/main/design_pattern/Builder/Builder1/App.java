
package main.design_pattern.Builder.Builder1;

public class App {


  /**
   * Program entry point
   * 
   * @param args command line args
   */
  public static void main(String[] args) {

    Hero mage =
        new Hero.Builder(Profession.MAGE, "Riobard").setHairColor(HairColor.BLACK)
            .setWeapon(Weapon.DAGGER).build();
    System.out.println(mage);

    Hero warrior =
        new Hero.Builder(Profession.WARRIOR, "Amberjill").setHairColor(HairColor.BLOND)
            .setHairType(HairType.LONG_CURLY).setArmor(Armor.CHAIN_MAIL).setWeapon(Weapon.SWORD)
            .build();
    System.out.println(warrior);

    Hero thief =
        new Hero.Builder(Profession.THIEF, "Desmond").setHairType(HairType.BALD)
            .setWeapon(Weapon.BOW).build();
    System.out.println(thief);
  }
}
