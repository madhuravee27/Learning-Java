package Methods;

class Obj {
    private int x;

    Obj(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

class Check{
    public void swap(Obj obj1, Obj obj2){
        Obj temp;
        temp = obj1;
        obj1 = obj2;
        obj2 = temp;
        System.out.println(obj1.hashCode());
        System.out.println(obj1.getX());
        System.out.println(obj2.hashCode());
        System.out.println(obj2.getX());
    }
}



public class SwapObject {
    public static void main(String[] args) {
        Obj obj1 = new Obj(10);
        Obj obj2 = new Obj(20);
        System.out.println(obj1.hashCode());
        System.out.println(obj1.getX());
        System.out.println(obj2.hashCode());
        System.out.println(obj2.getX());
        Check check = new Check();
        check.swap(obj1,obj2);
        System.out.println(obj1.hashCode());
        System.out.println(obj1.getX());
        System.out.println(obj2.hashCode());
        System.out.println(obj2.getX());
    }

}
