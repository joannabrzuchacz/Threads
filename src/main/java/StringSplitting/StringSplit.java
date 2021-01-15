package StringSplitting;

public class StringSplit {
    public static String[] solution(String s) {

        if(s.length() % 2 != 0){
            s = s + "_";
        }
        int x = 0;
        int z = 0;
        int length = s.length();
        String[] tempWord = s.split("");

        String pair[] = new String[length / 2];

        while( x < length){

            pair[z] = tempWord[x] + tempWord[x+1];

            x = x+2;
            z++;
        }

        return pair;
    }
}