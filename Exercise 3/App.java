public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        mage.name = "Gondar";
        thief.sayMyName();

        weapon sword = new weapon();

        sword.name = "Bow";
        sword.damage = 10;
        sword.rarity = "Level X";
        sword.addDamage(20);
        System.out.println(sword.weaponInfo());

        Character Bow = new Character();
        Bow.name = "Jorpetitoy";
        Bow.strength = 10;
        Bow.intelligence = 5;
        Bow.agility = 5;
        Bow.sayMyWeapon();
        Bow.Attack();
      

    }

}

