package JAVA_PRACTICE_BY_BASIC_TUT_BANGLA.Method_overRide;

public class testArea {
    public static void main(String[] args) {


        circle c = new circle(10);

        double c1 = c.area();

        System.out.println("AREA of Circle: "+ c1);


        Cylindetr cy = new Cylindetr(4,5);
        double c2 = cy.area();
        System.out.println("AREA of Cylinder: "+ c2);
        cy.Vol();
    }
}
