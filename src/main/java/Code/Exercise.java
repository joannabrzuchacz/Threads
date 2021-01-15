package Code;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise {

    public  static List<Integer> findDuplicates(List<Integer> integers, int numberOfDuplicates) {
        Set<Integer> setCollection = integers.stream()
                .filter(element -> Collections.frequency(integers, element) == numberOfDuplicates)
                .filter(x -> x != null)
                .collect(Collectors.toSet());

        List<Integer> listCollection = new ArrayList<>(setCollection);

        return listCollection;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(new Integer[]{1,1,4,4,5,5,5, null, null});

        System.out.println(Exercise.findDuplicates(numbers, 2));


    }

}
