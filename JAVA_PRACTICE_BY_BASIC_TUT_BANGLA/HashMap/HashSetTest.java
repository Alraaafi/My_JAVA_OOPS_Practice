package JAVA_PRACTICE_BY_BASIC_TUT_BANGLA.HashMap;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<String>();

        st.add("rafi");
        st.add("kafi");
        st.add("rafi");
        st.add("kafi");

        System.out.println(st);
    }
}
