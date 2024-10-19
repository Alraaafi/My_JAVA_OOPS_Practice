package JAVA_PRACTICE_BY_BASIC_TUT_BANGLA.INHERITENCE.Privet_inheritence;

import JAVA_PRACTICE_BY_BASIC_TUT_BANGLA.INHERITENCE.info;

public class anonimus_class {
    public static void main(String[] args) {
        info obj = new info()
        {
            @Override
            public void infoDis() {
                //super.infoDis();
                System.out.println("This Is Anonimusy Display");
            }
        };

        obj.infoDis();
    }
}
