/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicing.ABC;

public class Muli {
    
    static interface M
    {
        void prnt();
    }
    
    static interface N
    {
        void show();
    }
    
    static class A implements M,N
    {
        public void prnt()
        {
            System.out.println("Hello Print");
        }
        
        public void show()
        {
            System.out.println("Show Me");
        }
    }
    
    public static void main(String[] args) {
        A ob = new A();
        ob.prnt();
        ob.show();
    }
}
