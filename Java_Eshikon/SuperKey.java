package Java_Eshikon;

import java.io.FileNotFoundException;

public class SuperKey {
    public static  class info
    {
        String name;
        int age;
        info(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        void dis()
        {
            System.out.println("Your Info: ");
        }
    }

    public static class rafi extends info
    {
        int id;
        rafi(String nam, int ag, int i)
        {

            super(nam,ag);
            id = i;
        }
        void display()
        {
            super.dis();
            System.out.println("Name: "+name);
            System.out.println("age: "+age);
            System.out.println("id: "+id);
        }
    }


    public static void main(String[] args) {
        rafi obj = new rafi("Tanvir",20,28);
        obj.display();
    }
}
