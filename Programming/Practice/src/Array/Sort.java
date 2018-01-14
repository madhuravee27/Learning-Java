package Array;
import java.io.*;

public class Sort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array!");
        int n = Integer.parseInt(br.readLine());
        int sortArray[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value in position " + (i + 1) + ":");
            sortArray[i] = Integer.parseInt(br.readLine());
        }
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < (n - 1); i++) {
                int temp = 0;
                if (sortArray[i] > sortArray[i + 1]) {
                    temp = sortArray[i];
                    sortArray[i] = sortArray[i + 1];
                    sortArray[i + 1] = temp;
                    flag = true;
                } else
                    continue;
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.println(sortArray[i]);

        }
    }
}
