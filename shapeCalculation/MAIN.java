
package com.mycompany.practicing.shapeCalculation;

public class MAIN {


    public static void main(String args[]) {
        shape obj;
        obj = new rectange(2, 3, 5);
        obj.area();
        obj.peri();
        
        obj = new triangle(10, 4);
        obj.area();
        obj.peri();
        
        obj = new circle(3);
        obj.area();
        obj.peri();
        
        
    }
}
