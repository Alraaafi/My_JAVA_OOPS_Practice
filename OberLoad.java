
package com.mycompany.practicing;

public class OberLoad {
    
    static int add(int a , int b)
    {
        return a+b;
    }
    
    static int add(int a)
    {
        int res;
        res = (a * (a+1) )/2;
        return res;
    }
    
    static int add(int a, double d)
    {
        int b = (int)d;
        
        return a + b;
    }
    
    public static void main(String[] args) {   
         System.out.println("SUMMATION RESULT IS: "+ add(10,20));
         System.out.println("SUMMATION RESULT IS: "+ add(5));
         System.out.println("SUMMATION RESULT IS: "+ add(10,10.64));
    }
    
}
