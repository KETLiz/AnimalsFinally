import java.util.ArrayList;
import java.util.List;

public class Humster extends Animal {
    List<Humster> humsters = new ArrayList<>();
    
    public Humster(String name, Type type) {
        super(name, type);
    }
    
}
