package Interface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DatabaseTest {
    public static void main(String[] args) throws IOException{
        System.out.println("Enter your DB");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String dbName = br.readLine();
        try{
            Class c = Class.forName(dbName);
            Database db = (Database)c.newInstance();
            db.connect();
            db.disconnect();
        }
        catch(Exception e){
            System.out.println(e);
        }


    }
}

interface Database{
    void connect();
    void disconnect();
}

class OracleDB implements Database{
    public void connect(){
        System.out.println("Connected to Oracle DB!");
    }

    public void disconnect(){
        System.out.println("Disconnected from Oracle DB!");
    }
}

class AppleDB implements Database{
    public void connect(){
        System.out.println("Connected to Apple DB!");
    }

    public void disconnect(){
        System.out.println("Disconnected from Apple DB!");
    }
}