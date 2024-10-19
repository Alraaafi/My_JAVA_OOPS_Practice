package JAVA_PRACTICE_BY_BASIC_TUT_BANGLA;

public class palindrom {

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("MAM");

        StringBuilder str2 = str;

        str.reverse();

        if(str==str2)
            System.out.println("Palindrom: "+str);
        else
            System.out.println("NOT Palindrom: "+str);

        str.append(" APA");
        System.out.println(str);
        str.delete(2,4);
        System.out.println(str);

    }
}
