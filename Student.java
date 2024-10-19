
package com.mycompany.practicing;

public class Student {
       private int id;
       private double sc;

    public Student(int id, double sc) {
        this.id = id;
        this.sc = sc;
    }
    
    void display()
    {
        System.out.println("ID: "+id+ " and Score: "+sc );
    }
}

