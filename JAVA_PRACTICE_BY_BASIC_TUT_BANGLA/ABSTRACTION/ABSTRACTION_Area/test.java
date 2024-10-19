package JAVA_PRACTICE_BY_BASIC_TUT_BANGLA.ABSTRACTION.ABSTRACTION_Area;

public class test {
    public static void main(String[] args) {
        shape obj;

        obj = new rec(4,5);
        obj.area();

        obj = new tri(10,9);
        obj.area();


        obj = new cir(10);
        obj.area();

    }
}
