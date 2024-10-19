package Java_Eshikon;

public class Abstruction {

    abstract public static class A{
        int a=20;
        abstract void abs();
    }

    public static class B extends A{
        void abs()
        {
            System.out.println("Abstructed: "+a);
        }
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.abs();
    }
}
