package Nokia;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    public List<Item> basket = new ArrayList<>();

    public boolean addItem(Item ... itemName){
        try {
            for (int x = 0; x < itemName.length; x++){
            basket.add(itemName[x]);}
            return true;
        }catch (MyCustomException e){
            e.printStackTrace();
        }
        return false;
    }

    public List<Item> returnCurrentBasket(){
        return basket;
    }

    public Integer purchaseSummary(){
        return this.basket.stream()
                .map(item -> item.getPrice())
                .reduce(0, (current, element) -> current + element);
    }


}
