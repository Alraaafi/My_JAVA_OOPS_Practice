package JAVA_Assignment_3;
//Md. Tanvir Ahmed Rafi
public class HOMEWORK_1 {
    public  static class Animal
    {
        void makeSound()
        {
            System.out.println("Hi! I am Animal");
        }
    }
    public static class Cat extends Animal
    {
        void makeSound()
        {
            System.out.println("Hi! I am Cat. Mew mew mew");
        }
    }

    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.makeSound();
    }

}
