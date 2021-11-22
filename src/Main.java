public class Main {
    public static void main(String[] args) {
        Father father = new Father("Отец Егор", 35, "муж ", "врач");
        Son son = new Son("Сын Вовик", 7, " школьник ", " любитель животных ", new Pet [] { new Cat( "Кот ", "Микки", 1, 4,"чёрный")});
        Mother mother = new Mother("Мать Ирина", 35, "домохозяйка");
        Grandad grandad = new Grandad("Дед Денис", 65, "любитель животных",new Pet[] {new Dog("Собака","Бобик", 2, 15), new Fish ("рыба", "Пиранья", 1, 0,2)});
        Doughter doughter = new Doughter("Дочь Маша", 7, "ребёнок ", " любитель животных", new Pet [] {new Dog("Собака", "Мухтар", 20,20)} );
        Printer printer = new Printer();
        printer.print(mother);
        printer.print(father);
        printer.print(grandad);
        printer.print(son);
        printer.print(doughter);
    }

}
