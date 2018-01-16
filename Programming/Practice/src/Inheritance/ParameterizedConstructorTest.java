package Inheritance;

public class ParameterizedConstructorTest {
    public static void main(String[] args) {
        Two1 two1 = new Two1(20);
        two1.display();
    }
}

class One1{
    int x;
    One1(int x){
        this.x = x;
    }

    public void display(){
        System.out.println("Super class: "+x);
    }
}

class Two1 extends One1{
    private int x;
    Two1(int x){
        super(x-10);
        this.x = x;
    }

    public void display(){
        System.out.println("Sub class: "+x);
        System.out.println("Super class: "+super.x);
        super.display();
    }
}