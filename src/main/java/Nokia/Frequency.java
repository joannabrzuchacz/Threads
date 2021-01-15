package Nokia;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Frequency {


    public  static void wordFreq(List<String> terms) {

            Map<String, Integer> result = terms.parallelStream().
                    flatMap(s -> Arrays.asList(s.split(" ")).stream()).
                    collect(Collectors.toConcurrentMap(
                            w -> w.toLowerCase(), w -> 1, Integer::sum));
            System.out.println(result);
        }

    public static void factorial(int num){
        long factorial = 1;
        for(int i = 1; i <= num; ++i) {
            factorial *= i;
        }
        System.out.println(factorial);

    }

    public void changeCodeToStream(String word){

    }


    public static void main(String[] args) {
        Frequency frequency = new Frequency();
        Frequency frequency1 = new Frequency();

        System.out.println(frequency.equals(frequency1));
        List<String> terms = Arrays.asList(
                "Coding is great",
                "Search Engines are great",
                "Google is a nice search engine");

        Frequency.wordFreq(terms);

    }
}
