import java.util.ArrayList;
import java.util.List;

public class Service {
    Dog dog = new Dog();
    Cat cat = new Cat();
    Humster humster = new Humster();
    List commands = new ArrayList<>();

    // 1 - добавить животное
    public void addAnimal(String name, Type type) {
        if(type.name().equalsIgnoreCase(Type.DOG.name())) {
            dog.addAnimal(name, type);
        } else if(type.name().equalsIgnoreCase(Type.CAT.name())) {
            cat.addAnimal(name, type);
        } else if(type.name().equalsIgnoreCase(Type.HUMSTER.name())) {
            humster.addAnimal(name, type);
        }
    }

    // 2 - показать животных определённого типа
    public void showAnimals(Type type) {
        if(type.name().equalsIgnoreCase(Type.DOG.name())) {
            dog.showAnimals();
        } else if(type.name().equalsIgnoreCase(Type.CAT.name())) {
            cat.showAnimals();
        } else if(type.name().equalsIgnoreCase(Type.HUMSTER.name())) {
            humster.showAnimals();
        }
    }
    // 3 - вывести список команд, которые выполняет животное
    public void showAnimalsCommands(String name, Type type) {
        if(type.name().equalsIgnoreCase(Type.DOG.name())) {
            Animal d = dog.getAnimalByName(name);
            d.showCommands();
        } else if(type.name().equalsIgnoreCase(Type.CAT.name())) {
            Animal c = cat.getAnimalByName(name);
            c.showCommands();
        } else if(type.name().equalsIgnoreCase(Type.HUMSTER.name())) {
            Animal h = humster.getAnimalByName(name);
            h.showCommands();
        }
    }

    // 4 - обучить животное новой команде
    public List learnNewCommand(String name, Type type, String command) {
        if(type.name().equalsIgnoreCase(Type.DOG.name())) {
            Animal d = dog.getAnimalByName(name);
            d.addCommand(command);
        } else if(type.name().equalsIgnoreCase(Type.CAT.name())) {
            Animal c = cat.getAnimalByName(name);
            c.addCommand(command);
        } else if(type.name().equalsIgnoreCase(Type.HUMSTER.name())) {
            Animal h = humster.getAnimalByName(name);
            h.addCommand(command);
        }
        System.out.println("Команда добавлена!");
        return commands;
    }
}
