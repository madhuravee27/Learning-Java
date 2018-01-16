package RelationshipsObjects;

public class References {
    public static void main(String[] args) {
        Two two = new Two(10);
        two.display();
        One one = new One(20);
        One one1 = new One(two);
        two.display();
        one.display();
        one1.display();
    }
}

class One{
    static int x;
    static Two y;
    One(int x){
        this.x = x;
    }

    One( Two y){
        this.y = y;
        y.x = 30;
    }

    void display(){
        System.out.println(x);
        System.out.println(y.x);
        y.display();
    }
}

class Two{
    int x;
    Two(int x){
        this.x = x;
    }

    void display() {
        System.out.println(x);
    }
}