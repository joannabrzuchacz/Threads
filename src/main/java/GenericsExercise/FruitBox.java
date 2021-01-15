package GenericsExercise;

import java.util.List;

public class FruitBox<T> {
    public List<? extends Fruit> fruitPackage;
    public T fruit;


    public FruitBox(T fruit) {
        this.fruit = fruit;
    }

    public FruitBox() {
    }

    public T getFruit() {
        return fruit;
    }

    //generic method
    public <S> boolean sliceAnything(S element){
        System.out.println("it has been sliced");
        return true;

    }

    public void printAllFruits(List<? extends Fruit> fruitPackage ){
        this.fruitPackage = fruitPackage;
        for(Fruit fruit : fruitPackage){
            System.out.println(fruit);
        }
    }

    public void putAnythingYouWant(List<?> items){
        for(Object item : items){
            System.out.println(item);
        }
    }


    @Override
    public String toString() {
        return "FruitBox{" +
                "fruit=" + fruit +
                '}';
    }
}
