package JAVA_PRACTICE_BY_BASIC_TUT_BANGLA;

public class p_4_Wrapper_class {

    public static void main(String[] args) {

        int n = 10;
        Integer nn = Integer.valueOf(n); //Unboxing
        System.out.println(nn);

        Double dd =  new Double(12.34);
        double d = dd; //unboxing
        System.out.println(d);

    }
}
