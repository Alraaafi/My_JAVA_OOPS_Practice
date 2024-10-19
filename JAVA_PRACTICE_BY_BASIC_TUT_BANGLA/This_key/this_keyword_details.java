package JAVA_PRACTICE_BY_BASIC_TUT_BANGLA.This_key;

public class this_keyword_details {

    String name;
    double gpa;

    int age;

    this_keyword_details( String name, double gpa )
    {
        this.name = name;
        this.gpa = gpa;
    }

    this_keyword_details( String name, double gpa , int age)
    {
        this(name,gpa);
        this.age = age;
    }

    void dis()
    {
        System.out.println("NAME: "+name);
        System.out.println("GPA: "+gpa);
        System.out.println("age: "+age);
    }


}
