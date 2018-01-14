package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoRecursion {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a number:");
        int number = Integer.parseInt(br.readLine());
        System.out.println(norecursiontest(number));
        System.out.println(recursiontest(number));
    }

    public static long norecursiontest(int number){
        long result = 1;
        while(number > 0){
            result *= (number--);
        }
        return result;
    }

    public static long recursiontest(int number){
        long result;
        if (number == 1) return 1;
        result = (number * recursiontest(number-1));
        return result;
    }
}
