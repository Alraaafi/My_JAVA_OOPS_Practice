
package com.mycompany.practicing.shapeCalculation;


public abstract class shape {
    double h;
    double b;
    double w;
    
    public shape()
    {
        h = 1;
        b = 1;
        w = 1;
    }
    
    public shape(double h, double b, double w) {
        this.h = h;
        this.b = b;
        this.w = w;
    }
    
    double getArea()
    {
        double res;
        res = (h*b*w) ;
        return res;
    }
    
    abstract void area();
    abstract void peri();
    
}
