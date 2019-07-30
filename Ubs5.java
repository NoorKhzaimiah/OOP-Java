 /////////////////////////////////////////
package ubs5;
 /////////////////////////////////////// overload 
public class Ubs5 {

    static String x;
    String xxx;
    static {
    
        x="ssssssssss";
        System.out.println("ddddddddddddddddddddddddddddd");
    }
    
    public static void sum(int a , int b){
        System.out.println(a+b);
    }
    public static void sum(int a , int b,int c){
        System.out.println(a+b+c);
    }
    public static void sum(int a , int b,int c , int d){
        System.out.println(a+b+c+d);
    }
  
  
    public static void main(String[] args) {
        
        Ubs5 ccc=new Ubs5();
        Ubs5 ccc1=new Ubs5();
        
        
//        sum(1,2,3,6);
//        sum(1,2);
//        sum(2,8,4);
//        
       
    }
    
}
