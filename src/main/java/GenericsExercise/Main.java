package GenericsExercise;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Orange orange = new Orange("orange");
        Apple apple = new Apple("apple");

        List<Fruit> fruitsBasket = new ArrayList<>();

        fruitsBasket.add(orange);
        fruitsBasket.add(apple);


        List<Orange> orangesBox = new ArrayList<>();
        orangesBox.add(orange);


        FruitBox<Fruit> FruitBox = new FruitBox<>();

        FruitBox<Orange> orangeBox = new FruitBox<>(orange);

        //standard generic, returns current type of Fruit it has
        System.out.println("The current fruit I have: " + orangeBox.getFruit());

        //wildcard, takes basket of all different fruits and prints them
        System.out.println("Basket of fruits have: " );
        FruitBox.printAllFruits(fruitsBasket);

        //second example with wildcard
        System.out.println("here it prints only oranges:");
        FruitBox.printAllFruits(orangesBox);

        //generic method
        String test = "test";
        FruitBox.sliceAnything(test);

        String[] array = new String[5];
        array[0] = "A";
        array[1] = "B";
        array[2] = "C";
        array[3] = "D";
        array[4] = "E";

        for (String element : array) {
            System.out.println(element);

        }






    }
}
