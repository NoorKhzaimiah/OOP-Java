 
package ubs;
 
import java.util.Scanner;
//////////////////////////////////////// encapsoulation 
class EncapsoulationTest {
    private int data ;
    private int pass ;
    public EncapsoulationTest (int pass , int data ){
        this.pass= pass ;
        this.data = data  ;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }
     
    public void returnvar(int enteredpass ){
        if (enteredpass == this.pass)
           System.out.println (" YOUR LOGGIN!! , And Your data is : "+ data);
        else 
            System.out.println ("Incorrect password");
    }
    
}
public class Ubs {
    
    public static void main(String[] args) {
  EncapsoulationTest O1 = new EncapsoulationTest( 1234 , 6792);
 Scanner in = new Scanner(System.in);

    System.out.println("Enter your password ");
    int userpass = in.nextInt();
     
  O1.returnvar(userpass);
    
    }
    
}


