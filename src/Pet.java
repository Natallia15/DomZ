
    public class Pet {
        String type;
        String name;
        int age;
        double ves;

        Pet() {

        }

        Pet(String type, String name, int age, double ves) {
            this.type = type;
            this.name = name;
            this.age = age;
            this.ves = ves;

        }


        public void getInfo() {
            System.out.print("питомец " + type + ", имя " + name + " , возраст " + age + " вес " + ves);
        }
    }
