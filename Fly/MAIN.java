/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicing.Fly;


public class MAIN {
    public static void main(String[] args) {
        flyable obj;
        
        obj = new helicopter();
        obj.can_fly();
        
        obj = new spaceCrift();
        obj.can_fly();
        
        
        obj = new plane();
        obj.can_fly();
    }
    
}
