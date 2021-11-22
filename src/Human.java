public class Human {
    String name;
    int age;


    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

       public void zit() {
        System.out.println(name + " Живёт");
    }
    public void getInfo() {
        System.out.print( name + ", возраст "+ age+ "лет, ");

    }

}
