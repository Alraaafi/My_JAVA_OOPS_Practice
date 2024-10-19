import java.util.*;

public class eception_practice {

    public static void main(String[] args) {

        int x,y;
        Scanner scn = new Scanner(System.in);

        x = scn.nextInt();
        y = scn.nextInt();

        try
        {
            int a = x/y;
            if(x==y) throw new ArithmeticException("Rafi's Math Error");
            else System.out.println("YES");
        }
        catch (ArithmeticException ae)
        {
            System.out.println("SUCSESS!: "+ae);
        }
        catch (Exception e)
        {
            System.out.println("MY ERROR IS: "+e);
        }
    }
}
