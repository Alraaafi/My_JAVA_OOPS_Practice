
package com.mycompany.practicing.ABC;


public class Student {
    
    static class  A
    {
        void show()
        {
            System.out.println("I A Showing.....");
        }
    }
    
    static class B extends A
    {
        void show()
        {
            System.out.println("I B Showing...");
        }
    }
    
    
    public static void main(String[] args) {
        A obj;
        
        obj = new B();
        
        obj.show();
        
    }
}
