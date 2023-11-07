import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String name;
    private String birthday;
    private Type type;
    List<Animal> animals = new ArrayList<>();
    List<String> commands = new ArrayList<>();

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
        System.out.println("Животное добавлено!");
    } 

    public void showAnimals() {
        for(Animal a : animals) {
            System.out.println(a);
        }
    }

    public void showCommands() {
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
        System.out.println("Животного с таким именем не найдено");
        return null;
    }
}