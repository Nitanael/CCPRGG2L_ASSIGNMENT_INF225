import java.util.jar.Attributes.Name;





public class weapon {



   



    String Name;



    int damage;



    String rarity;






    public void WeaponStats() {



    System.out.println("The name of my weapon is " + Name);



    }

    public void WeaponDamage(){

        System.out.println("My " + Name + " deals " + damage);

    }



    public void WeaponRarity(){



        System.out.println("The rarity of my  " + Name + rarity);



    }



    public void Attack(){



        System.out.println("I am Attacking!");



    }



    public void AddDamage(int AdditionalDamage){

    int newDamage = this.damage + AdditionalDamage;



    System.out.println("Damage increased from " + damage + "to" + newDamage );

    this.damage= newDamage;

    }

   

    public String showNameandRarity(){

    return this.Name + "" + this.rarity;

   




    }

    }