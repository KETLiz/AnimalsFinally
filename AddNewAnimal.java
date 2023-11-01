public class AddNewAnimal {
    Dog dog;
    Cat cat;

    public void addAnimal(String name, Type type) {
        if(type.name().equalsIgnoreCase(Type.DOG.name())) {
            dog.addAnimal(name, type);
        } else if(type.name().equalsIgnoreCase(Type.CAT.name())) {
            cat.addAnimal(name, type);
        }
    }

}
