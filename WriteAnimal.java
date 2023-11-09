import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteAnimal {
    Animal animal;

    public void write(Animal animal, Type type) {
        if(type.name().equalsIgnoreCase(Type.DOG.name())) {
            try(ObjectOutputStream dog = new ObjectOutputStream(new FileOutputStream("dogs.txt"))) {
                dog.writeObject(animal);
            } catch(IOException e) {
                System.out.println("Что-то пошло не так с записью в файл");
                e.printStackTrace();
            }
        } else if(type.name().equalsIgnoreCase(Type.CAT.name())) {
            try(ObjectOutputStream cat = new ObjectOutputStream(new FileOutputStream("cats.txt"))) {
                cat.writeObject(animal);
            } catch(IOException e) {
                System.out.println("Что-то пошло не так с записью в файл");
            }
        } else if(type.name().equalsIgnoreCase(Type.HUMSTER.name())) {
            try(ObjectOutputStream humster = new ObjectOutputStream(new FileOutputStream("humsters.txt"))) {
                humster.writeObject(animal);
            } catch(IOException e) {
                System.out.println("Что-то пошло не так с записью в файл");
            }
        }
    }
}
