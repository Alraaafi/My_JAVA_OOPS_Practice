package com.mycompany.practicing;

import java.util.Scanner;

public class studentMain {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner( System.in );
        int i,n = 0;
        
        System.out.print("Enter Total Student: ");
        n = scn.nextInt();
        
        Student[] obj;
        obj = new Student[n];
        
        
        
        for (i = 0; i < n; i++) {
            System.out.print("Enter Id and Score of Student: "+(i+1)+" : ");
            int id;
            double sc;
            
            id = scn.nextInt();
            sc = scn.nextDouble();
            obj[i] = new Student(id,sc);
        }
        
        
        for (i = 0; i < n; i++)
        {
            System.out.print("Student - "+ (i+1) + " : " );
            obj[i].display();
        }
        
    }
}
