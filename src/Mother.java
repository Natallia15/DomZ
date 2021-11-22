public class Mother extends Human{
    String profession;
    String status;
    //String v;

    Mother(String name, int age, String profession) {
        super(name, age);
        //this.name = name;
       //this.age = age;
        this.profession = profession;
    }



    public void vospit () {
        System.out.println(name + "  Воспитывает");
        //v = "Воспитывает сына";
        //return v;
    }
    public void working () {
        System.out.println(name + profession);
    }



    @Override
    public void getInfo() {
        System.out.println( name + ", возраст "+ age+ "лет, "+" воспитывает сына, " +"не работает, она " + profession);

    }

}

