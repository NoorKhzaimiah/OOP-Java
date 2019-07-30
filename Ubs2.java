 
package ubs2;
/////////////////////////////////////////// polymorphism + inheritance+ override +upCasting 
 class parentclass{
 int y ; 
 int x ;
 
   public parentclass(int x ){
        this.x= x;
    }
 
    public parentclass( ){
       
    }
    public parentclass(int y, int x) {
        this.y = y;
        this.x = x;
    }
 
     public int sharedmethod() {
            System.out.println("Hello from parent class");
     return x+y ;
 }
      
     
 }
//////////////////////////////////////////////
class child1  extends parentclass {
     int a ; 

    public child1(int a, int y, int x) {
        super(y, x);
        this.a = a;
    }

     
      
     @Override
     public int sharedmethod() {
         System.out.println("Hello from child1 class");
     return (x/y)+a ;
     
 }
     
}
////////////////////////////////////////////
class child2  extends parentclass {
     int b ; 

    public child2(int b, int y, int x) {
        super(y, x);
        this.b = b;
    }
 
      
     @Override
     public int sharedmethod() {
     return (x/y)-b ;
 }
     
}
//////////////////////////////////////////////

public class Ubs2 {
 
    public static void main(String[] args) {
    parentclass p1 ;
    p1 = new child1(5,2,3); // upcasting
    System.out.println(p1.sharedmethod());
    p1 = new child2(5,2,3);
    System.out.println(p1.sharedmethod());
     
    }
    
}


