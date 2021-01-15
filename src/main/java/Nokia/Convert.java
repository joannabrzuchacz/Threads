package Nokia;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Convert {
    Map<String , String> map = createHashMap();

    public String wordConverter(String word){

        String  result = "";
        String[] tempWord = word.split("");

        for (int i = 0; i < word.length(); i++){
            result = result +  map.get(tempWord[i]);
        }
        return result;
    }

    public String encodeWithReduce(String word) throws MyCustomException {


        if (Objects.nonNull(word)) {
            String result = word.chars()
                    .mapToObj(c -> String.valueOf((char) c))
                    .reduce("", (accumulator, element) -> accumulator + map.get(element));
            return result;
        }
        else{
            throw new MyCustomException("You cannot use this word!");
        }

    }


    private Map<String, String> createHashMap() {

        Map<String , String> hashMap =  new HashMap<>();

        hashMap.put("A", "2");
        hashMap.put("B", "22");
        hashMap.put("C", "222");
        hashMap.put("D", "3");
        hashMap.put("E", "33");
        hashMap.put("F", "333");
        hashMap.put("G", "4");
        hashMap.put("H", "44");
        hashMap.put("I", "444");
        hashMap.put("J", "5");
        hashMap.put("K", "55");
        hashMap.put("L", "555");
        hashMap.put("M", "6");
        hashMap.put("N", "66");
        hashMap.put("O", "666");
        hashMap.put("P", "7");
        hashMap.put("Q", "77");
        hashMap.put("R", "777");
        hashMap.put("S", "7777");
        hashMap.put("T", "8");
        hashMap.put("U", "88");
        hashMap.put("V", "888");
        hashMap.put("W", "9");
        hashMap.put("X", "99");
        hashMap.put("Y", "999");

        return hashMap;
    }




}
