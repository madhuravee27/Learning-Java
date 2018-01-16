package Interface;

public class ChildTest {
    public static void main(String[] args) {
        Child child = new Child();
        child.height();
    }
}

class Child implements Father,Mother{
    public void height(){
        System.out.println((Father.height + Mother.height)/2);
    }
}

interface Father{
    double height = 6.2;
    void height();
}

interface Mother{
    double height = 5.8;
    void height();
}
