package GenericsExercise;

public class Orange extends Fruit {


    public Orange(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Orange{" +
                "name='" + name + '\'' +
                '}';
    }
}
