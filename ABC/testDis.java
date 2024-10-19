
package com.mycompany.practicing.ABC;

public class testDis {
    
    static class A
    {
        int x;
        
        public A(int x)
        {
            this.x = x;
        }
        
        public A(A oz)
        {
            x = oz.x;
        }
        
        void show()
        {
            System.out.println("RES: "+x);
        }
        
        
    }
    
    
    
    public static void main(String[] args) {
        A ob = new A(28);
        ob.show();
        
        A tt = new A(ob);
        tt.show();
        

    }
}
