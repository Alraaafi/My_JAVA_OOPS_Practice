package JAVA_PRACTICE_BY_BASIC_TUT_BANGLA.ABSTRACTION.ABSTRACTION_Area;

public class rec extends shape{
    rec(double d1, double d2)
    {
        super(d1,d2);
    }

    void area()
    {
        double res = d1*d2;
        System.out.println("AREA : "+ res);
    }
}
