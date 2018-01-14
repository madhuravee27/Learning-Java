package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Prime {
    private int arr[];
    private int max;

    Prime(int count) {
        max = count;
        arr = new int[max];
        arr[0] = 2;
    }

    public int[] generate() {
        int position = 1;
        loop: for (int i = 2; ; i++) {
            if (position < max) {
                boolean flag = true;
                for (int c = 0; c < position; c++) {
                    if (i % arr[c] == 0) {
                        flag = false;
                    }
                }
                if (flag) {
                    arr[position] = i;
                    position ++;
                }
            }
            else{
                break loop;
            }
        }
        return arr;

    }
}

public class PrimeTest {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of prime numbers: ");
        int count = Integer.parseInt(br.readLine());
        Prime pr = new Prime(count);
        int primeNumbers[] = pr.generate();
        for (int i = 0; i < primeNumbers.length; i++)
            System.out.println(primeNumbers[i]);

    }
}
