package ExceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryCatchBufferedReaderTrial {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a name: ");
        try{
            String name = br.readLine();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
