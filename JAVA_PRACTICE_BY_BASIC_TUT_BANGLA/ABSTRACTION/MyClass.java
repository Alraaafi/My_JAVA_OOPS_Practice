package JAVA_PRACTICE_BY_BASIC_TUT_BANGLA.ABSTRACTION;

public class MyClass {

    abstract static class Animal
    {

        abstract public String color();
        void name()
        {
            System.out.println("HELLO! I'am Tiger Bro!");
        }
    }

    public static void main(String[] args) {
        Animal ani = new Animal()
        {
            @Override
            public String color()
            {
                return "Tiger is Red and Black";
            }
        };

        System.out.println("property Of Tiger is: "+ ani.color());
    }
}
