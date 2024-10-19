package Java_Eshikon;

public class this_key_2 {
    public static class A{
        A(){
            System.out.println("Hello TMP");
        }
        A(int x)
        {
            this();
            System.out.println("Hello B: "+x);
        }
    }

    public static void main(String[] args) {
        A obj = new A(20);

    }
}
