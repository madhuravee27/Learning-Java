package Abstract;

public class BillTest {
    public static void main(String[] args) {
        DomesticConsumption dc = new DomesticConsumption();
        ElectricityBill eb = dc;
        dc.setRate();
        dc.displayCost(320);
        eb.displayCost(230);
        ElectricityBill eb2 = new CommercialConsumption();
        eb2.setRate();
        eb2.displayCost(500);
    }
}

abstract class ElectricityBill{
    protected double rate;

    abstract void setRate();

    void displayCost(double units){
        System.out.println(rate*units);
    }
}

class DomesticConsumption extends ElectricityBill{
    @Override
    void setRate() {
        super.rate = 2.6;
    }
}

class CommercialConsumption extends ElectricityBill{
    @Override
    void setRate() {
        super.rate = 5;
    }
}