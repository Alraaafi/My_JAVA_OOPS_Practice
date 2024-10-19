package com.mycompany.practicing;


public class Animal_overrride {
    
    static class Animal
    {
        void sound()
        {
            System.out.println("Animal");
        }
    }
    
    static class dog extends Animal
    {
        
        @Override
        void sound()
        {
            System.out.println("DOG");
        }
    }
    
    static class cat extends Animal
    {
        @Override
        void sound()
        {
            System.out.println("CAT");
        }
    }

    public static void main(String args[]) {
        Animal obj = new Animal();
        obj.sound();
        
        obj = new cat();
        obj.sound();
        
        obj = new dog();
        obj.sound();
        
    }
}
