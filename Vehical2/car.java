
package com.mycompany.practicing.Vehical2;


public class car extends vehical{

    public car(String model, int year, String typ) {
        super(model,year,typ);
    }
    
    @Override
     void getValue(double d, double total)
     {
         super.getValue(d, total);
     }
     
     

    @Override
    double eff() {
        return super.eff();
    }
   

    @Override
    void dis() {
        super.dis(); 
    }  
    
}
