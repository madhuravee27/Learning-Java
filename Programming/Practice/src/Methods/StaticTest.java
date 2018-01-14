package Methods;

class Test{
    private int x;
    Test(int x){
        this.x = x;
    }
    static void display(){
        System.out.println("Not working");
    }
}

public class StaticTest {
    public static void main(String[] args) {
        Test s = new Test(5);
        Test.display();
    }
}
