package Inheritance;

public class DefaultConstructorTest {
    public static void main(String[] args) {
        Two two = new Two();
    }
}

class One{
    One(){
        System.out.println("Super class");
    }
}

class Two extends One{
    Two(){
        System.out.println("Sub class");
    }
}