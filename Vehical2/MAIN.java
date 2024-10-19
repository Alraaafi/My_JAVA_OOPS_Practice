
package com.mycompany.practicing.Vehical2;


public class MAIN {

    public static void main(String args[]) {
       vehical obj;
       
       obj= new vehical("model", 0, "NULL");
       obj.getValue(1, 1);
       obj.dis();
       System.out.println("EFFICIENCY: "+obj.eff()+"%");
       System.err.println("\n");
       
       obj= new car("Mercedies", 2015, "super CAr");
       obj.getValue(200.24, 215.54);
       obj.dis();
       System.out.println("EFFICIENCY: "+obj.eff()+"%");
       System.err.println("\n");

       obj= new track("Yamaha", 2018, "track");
       obj.getValue(100, 130);
       obj.dis();
       System.out.println("EFFICIENCY: "+obj.eff()+"%");
       System.err.println("\n");

       obj= new motor("hero", 2010, "Byke");
       obj.getValue(180, 200.34);
       obj.dis();
       System.out.println("EFFICIENCY: "+obj.eff()+"%");  
       System.err.println("\n");
       
    }
}
