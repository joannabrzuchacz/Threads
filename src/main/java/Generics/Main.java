package Generics;



import Game.Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Bike bike = new Bike("bike");
        Car car = new Car("Ferrari");

        //two parameters in generic class
        Garage<Car, Bike> garage = new Garage<>(car, bike);

        List<String> boxOfElements = new ArrayList<>();

        boxOfElements.add("drill");


        garage.addElements(boxOfElements);

        System.out.println(garage);


    }
}
