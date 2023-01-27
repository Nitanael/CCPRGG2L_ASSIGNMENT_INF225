public class Pet {
    

String name;
Person owner;

Pet(String petName, Person ownerName){
this.name= petName;
this.owner= ownerName;
}
void Showownername(){
System.out.println("My pet's name is " + this.name + "My owner name is " + owner.name);

}    
}
