package JAVA_PRACTICE_BY_BASIC_TUT_BANGLA;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class p2_sort_array {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();

        num.add(3);
        num.add(7);
        num.add(2);
        num.add(8);
        num.add(1);

        System.out.println("Un-Sorted: "+num);

        Collections.sort(num);
        System.out.println("ASSENDING-Sorted: "+num);

        Collections.sort(num,Collections.reverseOrder());
        System.out.println("DESSENDING-Sorted: "+num);

    }
}
