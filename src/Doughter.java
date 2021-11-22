public class Doughter extends Human{
String ststus;
String animalOwner;
Pet[]pets;
    Doughter(String name, int age, String status, String animalOwner, Pet [] pets) {
        super(name, age);
        this.ststus = status;
        this.animalOwner = animalOwner;
        this.pets = pets;
 }

    public void listen () {
        System.out.println(name +" Слушает");
    }
    public void getInfo() {
        super.getInfo();
        System.out.println( "она "+ ststus +"и " + animalOwner);
        for (int i = 0; i < pets.length; i++) {
            pets [i].getInfo();
        }

    }


}
