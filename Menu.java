import java.util.Scanner;

public class Menu {
    // Animal animal;
    // Dog dog;
    // Cat cat;
    // Humster humster;
    private boolean work = true;
    Scanner sc = new Scanner(System.in);
    Service service = new Service();

    public void showMenu() {
        sayHello();
        while(work) {
            showCommands();
            String s = sc.nextLine();
            int num = Integer.parseInt(s);
            switch(num) {
                case 1:
                    System.out.print("Введите имя животного: ");
                    String name = sc.nextLine();
                    System.out.print("Введите тип животного: DOG, CAT, HUMSTER: ");
                    String t = sc.nextLine();
                    Type type = Type.valueOf(t);
                    service.addAnimal(name, type);
                    break;
                case 2:
                    System.out.print("Введите тип животного: DOG, CAT, HUMSTER: ");
                    String r = sc.nextLine();
                    Type res = Type.valueOf(r);
                    service.showAnimals(res);
                    break;
                case 3:
                    System.out.print("Введите имя животного: ");
                    String nameAnimal = sc.nextLine();
                    System.out.print("Введите тип животного: DOG, CAT, HUMSTER: ");
                    String q = sc.nextLine();
                    Type typeq = Type.valueOf(q);
                    service.showAnimalsCommands(nameAnimal, typeq);
                    break;
                case 4:
                    System.out.println("Выберите имя животного и его класс");
                    System.out.print("имя: ");
                    String n = sc.nextLine();
                    System.out.print("класс: ");
                    String c = sc.nextLine();
                    Type clas = Type.valueOf(c);
                    String newCommand = sc.nextLine();
                    service.learnNewCommand(n, clas, newCommand);
                    // if(clas.name().equalsIgnoreCase(Type.DOG.name())) {
                    //     Dog findDog = dog.getAnimalByName(n);
                    //     findDog.addCommand(newCommand);
                    // } else if(clas.name().equalsIgnoreCase(Type.CAT.name())) {
                    //     Animal findCat = cat.getAnimalByName(n);
                    //     findCat.addCommand(newCommand);
                    // } else if(clas.name().equalsIgnoreCase(Type.HUMSTER.name())) {
                    //     Animal findHumster = humster.getAnimalByName(n);
                    //     findHumster.addCommand(newCommand);
                    // }
                    break;
                case 5:
                    work = false;
                    sayGoodbye();
            }
        }
    }

    private void sayHello() {
        System.out.println("Добрый день!");
    }

    private void showCommands() {
        System.out.println("Выберите команду:\n1 - добавить животное\n" +
                            "2 - показать животных определённого типа\n" +
                            "3 - вывести список команд, которые выполняет животное\n" +
                            "4 - обучить животное новой команде\n" +
                            "5 - выход");
    }

    private void sayGoodbye() {
        System.out.println("Всего доброго!");
    }
}
