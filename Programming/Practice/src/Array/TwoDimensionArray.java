package Array;
import java.io.*;

public class TwoDimensionArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows:");
        int rows = Integer.parseInt(br.readLine());
        System.out.println("Enter the number of columns:");
        int columns = Integer.parseInt(br.readLine());
        int matrix[][] = new int[rows][columns];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.println("Enter the value for position "+i+"x"+j+":");
                matrix[i][j] = Integer.parseInt(br.readLine());
            }
        }
        System.out.println("The given matrix is:");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The transposed matrix is:");
        for (int i = 0; i < columns; i++){
            for (int j = 0; j < rows; j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}
