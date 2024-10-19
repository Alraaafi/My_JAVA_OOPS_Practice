package JAVA_PRACTICE_BY_BASIC_TUT_BANGLA.Polymorphism;

public class Run_Time {

    //Run Time PolyMorphism or Dynamic Polymorpism :    Method Overriding (to be Inherited)


    //class-1
    public static class person
    {
        void show()
        {
            System.out.println("I am Person");
        }
    }


    //Class-2
    public static class coder extends person
    {
        void show()
        {
            System.out.println("I am Programmer");
        }
    }


    //Class-3
    public static class engneer extends person
    {
        void show()
        {
            System.out.println("I am  engneer");
        }
    }


    //Main Method
    public static void main(String[] args) {
        person p;

        p = new person();
        p.show();

        p = new coder();
        p.show();

        p = new engneer();
        p.show();
    }


}
