package Java_assaignment_2;

public class Person_info_Problem_2 {
    public static  class person
    {
        public String str;
        public  int age;

        person(String s, int a)
        {
            str = s;
            age = a;
        }

        int getAge()
        {
            return age;
        }
        String getStr()
        {
            return str;
        }

    }

    public static void main(String[] args) {
        person p1 = new person("Tanvir Ahmed Rafi",21);
        person p2 = new person("Fahad Ahmed",22);

        System.out.println("Person-1: ");
        System.out.println("Name: "+p1.getStr()+"\n Age: "+p1.getAge());

        System.out.println("\n\nPerson-1: ");
        System.out.println("Name: "+p2.getStr()+"\n Age: "+p2.getAge());

        //System.out.printf("Sucsess!");
    }
}
