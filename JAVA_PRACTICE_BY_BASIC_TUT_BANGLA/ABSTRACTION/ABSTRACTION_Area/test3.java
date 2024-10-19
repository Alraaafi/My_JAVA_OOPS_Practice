package JAVA_PRACTICE_BY_BASIC_TUT_BANGLA.ABSTRACTION.ABSTRACTION_Area;

import java.awt.*;

public class test3 {

    int age;
    String name;
    test3(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    void show()
    {
        System.out.println("NAME IS: "+name);
        System.out.println("AGE IS: "+age);
    }

    public static void main(String[] args) {
        test3 obj = new test3(27, "robin Hood");
        obj.show();
    }
}
