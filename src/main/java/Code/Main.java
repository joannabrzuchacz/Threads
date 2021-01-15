package Code;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Main.test("Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn"));
    }


    public static String test(String s) {

        List<String> tempList = new ArrayList<>();
        String[] arrSplit = s.split(";");

        for (int x = 0; x < arrSplit.length; x++) {
            String[] bits = arrSplit[x].split(":");

            tempList.add("(" + bits[1].toUpperCase() + ", " + bits[0].toUpperCase() + ")");
        }

        Collections.sort(tempList, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });


        String listString = "";

        for (String string : tempList)
        {
            listString += string + " ";
        }


        return  listString;
    }
}
