public class Father extends Human{
    String profession;
    String status;
    //String v;

    Father(String name, int age, String status, String profession) {
        super(name, age);
        //this.name = name;
       //this.age = age;
        this.profession = profession;
        this.status = status;
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
        super.getInfo();
        System.out.println( status+ ", воспитывает сына " +"работает, он " + profession);

    }
}
