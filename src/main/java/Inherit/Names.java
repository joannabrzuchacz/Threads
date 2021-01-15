package Inherit;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Names {


    public static void main(String[] args) {

        List<String> namesList = Arrays.asList("Dominik",  "Paweł", "Dominik", "Maciek", "Maciek", "Dominik");

        Names names = new Names();
        System.out.println( names.countNames(namesList));


    }




    private Map<String, Integer> countNames(List<String> names){
        Map<String, Integer> namesCounts =  new HashMap<>();

        for (String name : names){
            if(namesCounts.containsKey(name))
                namesCounts.put(name, namesCounts.get(name) + 1);
            else
                namesCounts.put(name, 1);
        }

        return namesCounts;

    }
}
