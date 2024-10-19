package JAVA_PRACTICE_BY_BASIC_TUT_BANGLA.try_catch;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        double d  = 3.14164673485789345793;
        System.out.printf("%.2f\n",d); //formating......

        while(true)
        {
            try
            {
                int x,y,z;
                Scanner scn = new Scanner( System.in );
                System.out.print("Enter number 1 : ");
                x = scn.nextInt();
                System.out.print("Enter number 2 : ");
                y = scn.nextInt();
                z = x/y;
                System.out.println("Your Result Is : "+z);
            }
            catch (Exception e)
            {
                System.out.println("YOUR ERROR IS: " + e);

                System.out.println("TRY Again....... ");

            }
        }

    }
}
