package RelationshipsObjects;

public class CubeTest {
    public static void main(String[] args) {
        Cube cube = new Cube(new Square(new Number(10)));
        System.out.println(cube.result());
        System.out.println((new Square(new Number(20))).result());
        Power power = new Power(2,10);
        System.out.println(power.powers());
    }
}

class Cube{
    Square square;
    Cube(Square square){
        this.square = square;
    }

    int result(){
        return (square.result() * square.number.getNumber());
    }
}

class Square{
    Number number;
    Square(Number number){
        this.number = number;
    }

    int result(){
        return (number.getNumber() * number.getNumber());
    }
}

class Number{
    private int number;
    Number(int number){
        this.number = number;
    }

    int getNumber(){
        return number;
    }
}

class Power{
    private int number;
    private int raiseTo;

    Power(int number, int raiseTo){
        this.number = number;
        this.raiseTo = raiseTo;
    }

    public long powers(){
        //if(raiseTo == 0) return 1;
        if (raiseTo > 0) return (number * (new Power(number, (raiseTo - 1)).powers()));
        else return 1;
    }
}