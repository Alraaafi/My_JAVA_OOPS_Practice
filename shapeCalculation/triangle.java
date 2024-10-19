
package com.mycompany.practicing.shapeCalculation;

public class triangle extends shape{

    public triangle( double h, double b )
    {
        super(h, b, 1);
    }

    @Override
    double getArea() {
        return super.getArea()*0.5; 
    }
    
    @Override
   void area()
    {
        System.out.println("The Triangle area is: " + this.getArea() );
    }
    
   void peri()
   {
       double r,a;
       r = Math.sqrt(h*h + b*b );
       a = r+b+h;
       System.out.println("The Rectangle perimeter is: " + a );
   }
}
