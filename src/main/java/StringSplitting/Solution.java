public class Solution {

    public int solution(int number) {
        int x = 0;

        int tempNumber = 0;

        while(x < number) {

            if(x % 3 == 0 & x % 5 ==0){
                tempNumber = tempNumber + x;
            }
            else if(x % 3 == 0){
                tempNumber = tempNumber + x;
            }else if(x % 5 == 0){
                tempNumber = tempNumber + x;
            }else{
                continue;
            }
            x++;
        }

        return tempNumber;
    }
}