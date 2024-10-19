
package com.mycompany.practicing.shapeCalculation;

public class circle extends shape{

    public circle( double h )
    {
        super(h, h, 1);
    }

    @Override
    double getArea() {
        return super.getArea()*3.1416; 
    }
    
    @Override
   void area()
    {
        System.out.println("The Circle area is: " + this.getArea() );
    }
   
   void peri()
   {
       double r;
       r = 2*3.1416*h;
       System.out.println("The Rectangle perimeter is: " + r );
   }
    
    
}
