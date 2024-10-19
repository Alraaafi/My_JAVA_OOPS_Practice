package JAVA_PRACTICE_BY_BASIC_TUT_BANGLA;

public class p_6_number_conv {
    public static void main(String[] args) {

        String number_any_base = "ABCD987";

        Integer conv_base_int = Integer.parseInt(number_any_base, 16);

        System.out.println(conv_base_int);

    }
}
