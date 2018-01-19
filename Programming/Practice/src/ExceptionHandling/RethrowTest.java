package ExceptionHandling;

public class RethrowTest {
    public static void main(String[] args) {
        B b = new B(new A());
        b.display();
        //A a = new A();
        //a.display();
    }
}

class MyException extends Exception{
    MyException(String exception){
        super(exception);
    }
}

class A{
    public void display() {
        try {
            try {
                //throw new MyException("Exception is thrown");
                char ch = "Nira".charAt(5);
            }
            catch (StringIndexOutOfBoundsException e) {
                System.out.println("In class A");
                //ud.printStackTrace();
                throw e;
            }
            finally {
                System.out.println("Cleanup done!");
            }
        }
        catch(StringIndexOutOfBoundsException e){
            //e.printStackTrace();
            throw e;
            //System.out.println("It has been caught");
        }
    }
}

class B{
    private A a;
    B(A a){
        this.a = a;
    }
    void display(){
        try{
            a.display();
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("It has been caught!");
            e.printStackTrace();
        }
    }
}
