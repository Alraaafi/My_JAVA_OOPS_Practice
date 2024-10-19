package Java_Eshikon;

public class Interface {

    interface in
    {
        void a();
        void b();
        void c();
    }

    abstract public static class Class1 implements in
    {
        public void a() {
            System.out.println("Hello I am TMP");
        }
    }

    public static class Class2 extends Class1
    {
        public void b()
        {
            System.out.println("Hi I am B");
        }

        public void c()
        {
            System.out.println("Hey I am C");
        }
    }

    public static void main(String[] args) {
        in test = new Class2();
        test.a();
        test.b();
        test.c();
    }
}
