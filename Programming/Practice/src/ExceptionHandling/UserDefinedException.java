package ExceptionHandling;

import java.lang.Throwable;

public class UserDefinedException {
    public static void main(String[] args) {
        try{
            //System.out.println(45/0);
            //UserDefined ud = new UserDefined("Nira is so wicked!");
            //throw ud;
            throw new UserDefined("Blah");
        }
        catch(UserDefined e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Clean up is done!");
        }
    }
}

class UserDefined extends Exception{
    UserDefined(String exception){
        super(exception);
    }
}