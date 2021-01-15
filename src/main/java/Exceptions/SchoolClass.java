package Exceptions;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class SchoolClass {

    public static void main(String[] args) {

//        List<String> students = Arrays.asList("Dominik", "Dominik", "Maciek",  "Dominik", "Tomek");
//        Map<String, Integer> childrenClass = new HashMap<>();
//
//        for (String student : students){
//            if (childrenClass.containsKey(student)){
//                childrenClass.put(student, childrenClass.get(student) +1);
//            }else {
//                childrenClass.put(student, 1);
//            }
//        }
//        System.out.println(childrenClass);
        System.out.println(uglifyWord("HeLlO WoRlD"));



    }

    public static int[] pendulum(final int[] values) {
        int arraySize = values.length;
        int min = getMin(values);
        int[] finalArray = new int[arraySize];
        finalArray[0] = min;

        for (int i = 0; i < arraySize; i++) {
            int tempIndexOfMin = Arrays.asList(finalArray).indexOf(min);
            if (values[i] > min) {
                finalArray[tempIndexOfMin + 1] = values[i];
            } else if (values[i] < min) {
                finalArray[tempIndexOfMin - 1] = values[i];

            }
        }
        for(int i = 0; i < finalArray.length; i++) {
            System.out.print(finalArray[i]);
        }
        return finalArray;

    }

    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
}

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sumOfPoint = 0;
        int sumOfElements = classPoints.length;

        for (int score : classPoints)  sumOfPoint += score;

        double avg = sumOfPoint/sumOfElements;

        if (avg > yourPoints){
            return false;
        }else {
            return true;
        }
    }

    public static int fourSeven(int n){
        int four = 4;
        int seven = 7;

        boolean cond1 = four == n;
        boolean cond2 = seven == n;

        while (cond1){
            return 7;
        }

        while (cond2){
            return 4;
        }
        return 0;
    }

    public static String multiTable(int num) {
        String finalResult = "";
        String number = String.valueOf(num);
        for(int i =1; i <= 10; i++){
            String currentNum = String.valueOf(i);
            String result = String.valueOf(i * num);

            if(i == 10){
                finalResult += "" +  currentNum + " * " +   number + " = " + result;
            }else{
                finalResult += "" +  currentNum + " * " +   number + " = " + result + "\n";
            }
        }
        return finalResult;
    }

    public static String uglifyWord(String str) {
        String[] splitterString = str.split("");
        String result = "";

        for(int i =0; i <str.length(); i++){
            if(i == 0){
                result += splitterString[i].toUpperCase();
                continue;
            }else if(i == 1){
                result +=  splitterString[i].toLowerCase();
                continue;
            }else if( i % 2 == 0){
                result +=  splitterString[i].toUpperCase();
                continue;
            }else if(i % 2 != 0){
                result +=  splitterString[i].toUpperCase();
            }else{
                continue;
            }
        }
        return result;
    }
}
