package RelationshipsObjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InnerClass {
    public static void main(String[] args) throws IOException{
        BankAcct bankAcct = new BankAcct(1000);
        bankAcct.contact(10);
        bankAcct.display();
    }
}

class BankAcct{
    private int amount;
    private Interest interest;

    BankAcct(int amount){
        this.amount = amount;
    }

    void contact (double rate)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter password: ");
        String pwd = br.readLine();
        if (pwd.equals("12345")){
            Interest interest = new Interest(rate);
            this.interest = interest;
            interest.calculateAmt();
        }
        else System.out.println("Sorry you have entered the wrong password!");
    }

    void display(){
        System.out.println(interest.rate);
        interest.rate = 20;
        interest.calculateAmt();
    }

    private class Interest{
        private double rate;
        Interest(double rate){
            this.rate = rate;
        }

        private void calculateAmt(){
            System.out.println(amount*(1+(rate/100)));
        }
    }
}
