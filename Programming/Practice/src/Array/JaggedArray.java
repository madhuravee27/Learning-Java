package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JaggedArray {
    public static void main(String[] args) throws IOException{
        int arr[][] = new int[2][];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of values in row 1:");
        int r1 = Integer.parseInt(br.readLine());
        System.out.println("Enter the number of values in row 2:");
        int r2 = Integer.parseInt(br.readLine());
        arr[0] = new int[r1];
        arr[1] = new int[r2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }

        for (int i = 0; i < arr.length; i++){
            for(int num : arr[i]){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
