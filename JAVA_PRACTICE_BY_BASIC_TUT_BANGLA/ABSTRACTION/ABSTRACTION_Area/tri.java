package JAVA_PRACTICE_BY_BASIC_TUT_BANGLA.ABSTRACTION.ABSTRACTION_Area;

public class tri extends shape{
    tri( double l1, double l2 )
    {
        super(l1,l2);
    }

    void area()
    {
        double res = 0.5 * d1*d2;
        System.out.println("AREA : "+ res);
    }
}
