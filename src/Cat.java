public class Cat extends Pet {
    String color;
    public Cat(String type, String name, int age, double ves, String color){
        super(type, name, age, ves);
        this.color = color;
           }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println(" окрас " + color);
    }
}
