
package com.mycompany.practicing;

import java.util.Scanner;


public class maxi {
    public static void main(String[] args) {
        
        int i=1;
        int n;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Num: ");
        n = sc.nextInt();
        
        
        int num,mx = 0;
        
        System.out.println("Enter All Elements: ");
        for (i = 1; i <= n; i++) {
           num = sc.nextInt();
           
           if(num>mx)
               mx = num;
        }
        
        System.out.println("The MAx Number is : "+mx);
    }
}
