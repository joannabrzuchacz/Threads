package Generics;

import java.util.Collection;
import java.util.List;

class MyGenericClass<T, U> {
    private final Box<T> box;
    private U field;
    public List<?> wildcard;

    public MyGenericClass(Box<T> box) {
        this.box = box;
    }

    public Box<T> getGenericClass() {
        return box;
    }

    public List<?> saveMyList(List<?> wildcardList){
        this.wildcard = wildcardList;
        return wildcardList;
    }

    public List<?> myMethod(List<?> something ){
        return something;
    }

    public boolean containsAll(Collection<?> c){
        return true;
    }

    public U anotherMethod(U field){
        return this.field = field;

    }

    //generic method
    public <S> void genericMethod(S field){
        System.out.println(field);
    }


}

