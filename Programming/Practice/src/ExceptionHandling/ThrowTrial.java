package ExceptionHandling;

public class ThrowTrial {
    public static void main(String[] args) {
        try {
            //System.out.println(45/0);
            throw new ArithmeticException("Nira is so mean!");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Madhu is so sweet!");
        }
    }
}
