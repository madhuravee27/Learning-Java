package Methods;

class Swap{
    private int x;

    Swap(int x){
        this.x = x;
    }

    public int getX(){
        return x;
    }

    public void swapObjects(Swap obj1, Swap obj2){
        int temp;
        temp = obj1.x;
        obj1.x = obj2.x;
        obj2.x = temp;
    }
}

public class PassValue {
    public static void main(String[] args) {
        Swap obj1 = new Swap(10);
        Swap obj2 = new Swap(20);
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj1.getX());
        System.out.println(obj2.getX());
        obj1.swapObjects(obj1,obj2);
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj1.getX());
        System.out.println(obj2.getX());
    }
}
