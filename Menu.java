import java.util.Scanner;

public class Menu {
    private boolean work = true;
    Scanner sc = new Scanner(System.in);
    Service service = new Service();

    public void showMenu() {
        sayHello();
        while(work) {
            showCommands();
            String s = sc.nextLine();
            int num = checkNumber(s);
            
            switch(num) {
                case 1:
                    try {
                        String name = inputName();
                        Type type = inputType();
                        service.addAnimal(name, type);
                        
                    } catch (IllegalArgumentException e) {
                        System.out.println("Введите DOG, CAT или HUMSTER");
                    }
                    break;
                case 2:
                    try {
                        Type type2 = inputType();
                        service.showAnimals(type2);
                    } catch(IllegalArgumentException e) {
                        System.out.println("Введите DOG, CAT или HUMSTER");
                    }
                    break;
                case 3:
                    String name3 = inputName();
                    Type type3 = inputType();
                    service.showAnimalsCommands(name3, type3);
                    break;
                case 4:
                    System.out.println("Выберите имя животного и его класс");
                    String name4 = inputName();
                    Type type4 = inputType();
                    String newCommand = sc.nextLine();
                    service.learnNewCommand(name4, type4, newCommand);
                    break;
                case 5:
                    work = false;
                    sayGoodbye();
                    break;
                default:
                    System.out.println("Введите значение от 1 до 5");
                    break;
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

    private String inputName() {
        System.out.print("Введите имя животного: ");
        String name = sc.nextLine();
        return name;
    }

    private Type inputType() {
        System.out.print("Введите тип животного: DOG, CAT, HUMSTER: ");
        String t = sc.nextLine().toUpperCase();
        Type type = Type.valueOf(t);
        return type;
    }

    public static boolean isNumeric(String strNum) {
        return strNum.matches("-?\\d+(\\.\\d+)?");
    }

    private int checkNumber(String num) {
        try {
            if(isNumeric(num)) {
                return Integer.parseInt(num);
            }
        } catch (NumberFormatException e) {
            System.out.println("Не понимаю почему, но это работает");
        }
        return 0;
    }
}
