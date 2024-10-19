package JAVA_PRACTICE_BY_BASIC_TUT_BANGLA;

public class p_5_String_to_dataType {

    public static void main(String[] args) {

        //String to data Type
        String str  = "123";
        int i = Integer.valueOf(str); //or
        int j = Integer.parseInt(str);
        System.out.println(i+" and "+j);

        //Data Type to String
        double d = 123.456;
        String s = Double.toString(d);
        System.out.println(s);



    }
}
