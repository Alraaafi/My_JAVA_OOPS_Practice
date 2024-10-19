
package com.mycompany.practicing;

import java.util.Scanner;

public class stringP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str;
        
        str = sc.next();
        
        String up = str.toUpperCase();
        String dwn = str.toLowerCase();
        
        System.out.println("res: "+up+" "+dwn);
    }
}
