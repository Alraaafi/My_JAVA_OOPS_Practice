
package com.mycompany.practicing.shapeCalculation;



public class rectange extends shape{

    public rectange( double h, double b, double w )
    {
        super(h, b, w);
    }

    @Override
    double getArea() {
        return super.getArea(); 
    }
    
    @Override
   void area()
    {
        System.out.println("The Rectangle area is: " + this.getArea() );
    }
   
    @Override
   void peri()
   {
       double r;
       r = 2*(h+b);
       System.out.println("The Rectangle perimeter is: " + r );
   }
    
    
}
