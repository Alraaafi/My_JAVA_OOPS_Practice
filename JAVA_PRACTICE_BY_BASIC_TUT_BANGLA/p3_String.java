package JAVA_PRACTICE_BY_BASIC_TUT_BANGLA;

public class p3_String {
    public static void main(String[] args) {
        String str = "Tanvir ahmed";

        System.out.println("Orginal string: "+str);

        int pos = str.indexOf('v');
        System.out.println("first pos: "+pos);

        int pos2 = str.lastIndexOf('a');
        System.out.println("LAST pos: "+pos2);

        char ch = str.charAt(5);
        System.out.println("first pos: "+ch);

        int ascii = str.codePointAt(1);
        System.out.println("ASCII value: "+ascii);

        String str2 =  str.replace('a','A');
        System.out.println("New Str: "+str2);

        String st[] = str.split(" ");
        for(String x : st)
            System.out.println(x);


    }
}
