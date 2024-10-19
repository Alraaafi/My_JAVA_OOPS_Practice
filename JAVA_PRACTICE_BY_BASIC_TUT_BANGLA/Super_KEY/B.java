package JAVA_PRACTICE_BY_BASIC_TUT_BANGLA.Super_KEY;

public class B extends A{

     int x = 55;

     B()
     {
         super();
         System.out.println("B Constructor");
     }
    void display()
    {

        System.out.println("I am CURRENT class variable: "+ x);
        System.out.println("I am SUPER class variable: "+ super.x );
    }

    @Override
    void show() {
        super.show();
        System.out.println("HEY This Is B, OVERRIDEED");
    }
}
