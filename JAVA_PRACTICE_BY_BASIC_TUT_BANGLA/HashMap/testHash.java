package JAVA_PRACTICE_BY_BASIC_TUT_BANGLA.HashMap;

import java.util.HashMap;

public class testHash {
    public static void main(String[] args) {

        HashMap<Integer, String> mp = new HashMap<Integer, String>();

        mp.put(101, "RAFI VAi");
        mp.put(105, "KAFI Bro");
        mp.put(109, "Fahad ullah");

        System.out.println(mp.get(101));
        System.out.println(mp.get(109));
    }
}
