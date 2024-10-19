package com.mycompany.practicing.Vehical2;

public class vehical {
    String model;
    int year;
    String typ;
    
    double d;
    double total;

    public vehical(String model, int year, String typ) {
        this.model = model;
        this.year = year;
        this.typ = typ;
    }
    
    void getValue(double d, double total)
    {
        this.d = d;
        this.total = total;
    }
    
    double eff()
    {
        return (d/total)*100;
    }
    
    void dis()
    {
        System.out.println("MODEL: "+model);
        System.out.println("YEAR: "+year);
        System.out.println("TYPE: "+typ);
    }
    
    
}
