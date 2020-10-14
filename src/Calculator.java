import java.util.*;
import java.lang.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println(add(obj.nextLine()));
    }

    private static int add(String numbers){
        int sum = 0;
        if(!numbers.equals("")){
            int[] num = getNumbers(numbers);
            for(int i=0; i<num.length; i++){
                sum = sum+num[i];
            }
        }
        return sum;
    }

    private static int[] getNumbers(String numbers){
        String[] delimiterRemoved = delimiterRemoved1(numbers);
        int[] num = new int[delimiterRemoved.length];
        for(int i=0; i< num.length; i++){
            num[i] = Integer.parseInt(delimiterRemoved[i]);
        }
        return num;
    }

    private static String[] delimiterRemoved1(String numbers){
        String[] delimiterRemoved = numbers.split(",");
        return delimiterRemoved;
    }

}
