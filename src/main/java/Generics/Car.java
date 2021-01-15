package Generics;

public class Car {

    public String name;

    public Car(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
