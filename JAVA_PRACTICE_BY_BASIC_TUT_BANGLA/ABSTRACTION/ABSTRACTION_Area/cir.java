package JAVA_PRACTICE_BY_BASIC_TUT_BANGLA.ABSTRACTION.ABSTRACTION_Area;

public class cir extends shape {
    cir(double r)
    {
        super(r,r);
    }

    void area()
    {
        double res = 3.1416 * d1*d2;
        System.out.println("AREA : "+ res);
    }
}
