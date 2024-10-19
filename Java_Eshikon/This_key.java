package Java_Eshikon;

public class This_key {
    public static class Area{
        int a,b;
        Area(int a, int b)
        {
            this.a = a;
            this.b = b;
        }
        void display()
        {
            System.out.println("Area Is: "+(a*b));
        }
    }

    public static void main(String[] args) {
        Area A = new Area(6,5);
        A.display();
    }
}
