package Java_Eshikon;

public class iNHERITANCE {
    public static class circle
    {
        double r;
        circle(double x)
        {
            r = x;
        }
        double AreaC()
        {
            return 3.1416*r*r;
        }
    }


    public static class cylinder extends circle
    {
        double h;
        cylinder(double rr, double hh)
        {
            super(rr);
            h = hh;

        }



        double AreaCy()
        {
            return h*r*r*3.1416;
        }
    }

    public static void main(String[] args) {
        circle c1 = new circle(4);
        System.out.println(c1.AreaC());

        cylinder c2 = new cylinder(3,4);
        System.out.println(c2.AreaCy());

        //system.out.println(493480039);
    }
}
