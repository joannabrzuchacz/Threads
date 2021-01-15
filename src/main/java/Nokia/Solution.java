package Nokia;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {
    public static int[] sortByFrequency(int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());

        Map<Integer, Long> freq = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        list.sort((a, b) -> {
            if (freq.get(a) == freq.get(b)) {
                return a - b;
            }
            return (int) (freq.get(b) - freq.get(a));
        });

        return list.stream().mapToInt(i -> i).toArray();
    }




        public static void main(String[] args) {
        Solution solution = new Solution();
          int[] array= {3, 3, 3, 5, 5, 7, 7, 2,2,2,2,2, 9,9,9,9,9,9,9,99,9,9,9,9,9,9,9,9,9,9,9,99,9,9,9};
        int[] arr = solution.sortByFrequency(array);
        for (int x =0; x<array.length; x++){
            System.out.println(arr[x]);

        }
    }
}