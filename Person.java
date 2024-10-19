
package com.mycompany.practicing;

public class Person {
    
    //public static class man
    //{
            public String name;
            public int age;

            public Person(String name, int age)
            {
                this.age = age;
                this.name = name;
            }

            void show()
            {
                System.out.println("NAME: "+name+" AGE: "+age);
            }
    //}
    

        public static void main(String args[]) {
        Person obj = new Person("Rafi", 20);
        obj.show();
        }

    

}

