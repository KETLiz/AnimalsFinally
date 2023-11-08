import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Animal implements Serializable{
    private String name;
    private String birthday;
    private Type type;
    List<Animal> animals = new ArrayList<>();
    List<String> commands = new ArrayList<>();
    Counter counter = new Counter();

    public Animal() {

    }

    public Animal(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public Type getType() {
        return type;
    }

    public String toString() {
        return "Меня зовут " + getName() + ", я из рода " + getType();
    }

    public void addAnimal(String name, Type type) {
        for(Animal animal : animals) {
            if(animals != null) {
                if(animal.getName().equalsIgnoreCase(name)) {
                    System.out.println("Животное с таким именем уже есть!");
                    return;
                }
            }
        }
        animals.add(new Animal(name, type));
        counter.add();
        System.out.println("Животное добавлено! Counter = " + counter.getCount());
    } 

    public void showAnimals() {
        if(animals.isEmpty()) {
            System.out.println("Животных такого типа пока нет. Вы можете добавить их, " +
                    "вернувшись к пункту 1");
        }
        for(Animal a : animals) {
            System.out.println(a);
        }
    }

    public void showCommands() {
        if(commands.isEmpty()) {
            System.out.println("Это животное пока ничего не умеет");
        }
        for(String command : commands) {
            System.out.println(command);
        }
    }

    public List<String> addCommand(String command) {
        commands.add(command);
        return commands;
    }

    public Animal getAnimalByName(String name) {
        for(Animal animal : animals) {
            if(animal.getName().equalsIgnoreCase(name)) {
                return animal;
            }
        }
        System.out.println("Животное с таким именем не найдено");
        return null;
    }
}