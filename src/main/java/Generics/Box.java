package Generics;

public class Box<T> {
        public T miniBox;

    public Box(T miniBox) {
        this.miniBox = miniBox;
    }


    public void print(T miniBox){
        System.out.println(miniBox);
    }

}
