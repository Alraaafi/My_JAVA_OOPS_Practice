package JAVA_PRACTICE_BY_BASIC_TUT_BANGLA.OOP_PRACTICE_BASIC;

public class student_class {
    String name;
    int age;
    long  phone;


    void setter(String str, int a, long p)
    {
        name = str;
        age = a;
        phone = p;
    }

    void getter()
    {
        System.out.println("NAME: "+name);
        System.out.println("AGE: "+age);
        System.out.println("PHONE: "+phone);
    }


}


