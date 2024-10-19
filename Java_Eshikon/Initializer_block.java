package Java_Eshikon;

public class Initializer_block {

    public static  class A{
        A()
        {
            System.out.println("Hello I am Constructor Class TMP");
        }
    }

    public static class B extends A
    {
        B()
        {
            //1. execute Parent class constructor
            //2. execute Initializer Block
            //1. execute Current Constructor

            System.out.println("HI! I am Constructor Class B");
        }

        {
            System.out.println("hey! I am Initilizer Block");
        }
    }


    public static void main(String[] args) {
        B obj = new B();
    }
}
