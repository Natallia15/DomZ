public class Grandad extends Human{
String animalOwner;
Pet [] pets;
    Grandad(String name, int age, String animalOwner, Pet [] pets) {
super(name, age);
this.animalOwner = animalOwner;
      this.pets = pets;

        }



    public void rest () {
        System.out.println(name +" Отдыхает");
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println(animalOwner+ " имеет:");
        for (int i = 0; i < pets.length; i++){
            pets [i].getInfo();
            System.out.println();

    }

}}
