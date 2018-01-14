package Array;

public class TwoClasses {
    public static void main(String[] args) {
        String inputs[] = {"22", "34"};
        Class2.main(inputs);
    }
}

class Class2{
    public static void main(String []args) {
        if (args.length != 2){
            System.out.println("Enter 2 values");
        }
        else  {
            Double num1 = Double.parseDouble(args[0]);
            Double num2 = Double.parseDouble(args[1]);
            System.out.println(num1 + num2);
        }
    }
}
