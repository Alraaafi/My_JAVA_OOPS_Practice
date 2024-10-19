/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.practicing;


public class Worker {
    
    public static class emp
    {
        void work()
        {
            System.out.println("i AM A eMPLYEE");
        }
    }
    
    public static class hr extends emp {
        
        void add()
        {
            System.out.println("New ADD HR");
        }
        
        @Override
        void work()
        {
            System.out.println("i AM A eMPLYEE");
        }
    }
    
    public static void main(String args[]) {
        hr ob = new hr();
        ob.work();
        ob.add();
    }
}
