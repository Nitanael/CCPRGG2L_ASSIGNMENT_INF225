public class App {

 

    public static void main(String[] args) {




 

        character knight = new character();

 

        knight.strength = 10;

        knight.agility = 5;

        knight.intelligence = 0;

        knight.name = "beeds";

 

   

 

        character mage = new character();



 

        mage.strength = 0;

        mage.agility = 5;

        mage.intelligence = 10;

        mage.name = "coal";




 

        character thief = new character();




 

        thief.strength = 5;

        thief.agility = 10;

        thief.intelligence = 0;

        mage.name = "baylor";

 

       




 

character Assassin = new character();

Assassin.strength = 10;

Assassin.agility = 50;

Assassin.intelligence = 5;

Assassin.name = "";

Assassin.sayMyName();





 

        weapon abisword = new weapon();

 

        abisword.Name = "Dark blade";

        abisword.damage = 100;

        abisword.rarity = "Legendary";

        abisword.WeaponStats();

        abisword.WeaponDamage();

        abisword.WeaponRarity();

        abisword.Attack();


          System.out.println(abisword.showNameandRarity()); 
          abisword.AddDamage(0); } 

 

    }
