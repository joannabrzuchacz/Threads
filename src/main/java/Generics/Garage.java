package Generics;

import java.util.List;

public class Garage<E, T> {

    private E firstItem;
    private T secondItem;



    public Garage(E firstItem, T secondItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
    }

    public Garage(E firstItem){
        this.firstItem = firstItem;
    }



    public boolean addElements(List<?> elements){

        if(elements.size() != 0 ) {
            return true;
        }
        return false;
    }

    public void doSomething(List <?> list){

        System.out.println(list);
    }

    @Override
    public String toString() {
        return "Garage{" +
                "firstItem=" + firstItem +
                ", secondItem=" + secondItem +
                '}';
    }
}
