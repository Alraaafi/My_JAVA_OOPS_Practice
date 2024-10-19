package Java_Eshikon;

public class this_key_3 {
    public  static  class A
    {
        void M(A obj1)
        {
            System.out.println("Method Invoked! Address is: "+ obj1);
        }
        void  N()
        {
            M(this);
        }
    }

    public static void main(String[] args) {
        A obj2 = new A();
        obj2.N();
        System.out.println("Address of main Obj: "+ obj2);
    }
}
