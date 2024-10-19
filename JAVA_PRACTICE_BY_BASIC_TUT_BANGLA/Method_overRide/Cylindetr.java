package JAVA_PRACTICE_BY_BASIC_TUT_BANGLA.Method_overRide;

public class Cylindetr extends circle{
    double h;

    Cylindetr(double r, double h)
    {
        super(r);
        this.h = h;
    }

    @Override
    double area() {
        double res = ( 2*3.1416*r*h ) + ( 2*3.1416*r*r);
        return res;
    }

    void Vol()
    {
        double v = super.area() * h;
        System.out.println("VOLUM: "+ v);
    }
}
