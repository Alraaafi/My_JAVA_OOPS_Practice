package JAVA_PRACTICE_BY_BASIC_TUT_BANGLA.INHERITENCE;

public class test2 {
    interface Animal{
        public abstract void name(String animalName);
        String color();
    }
    interface Cow{
        void work();
    }
    public class Main implements Animal, Cow{

        @Override
        public void name(String animalName) {
            System.out.println(animalName);
        }
        @Override
        public String color() {
            return "Red";
        }
        @Override
        public void work() {
            System.out.println("Gives Milk");
        }
    }

    public  void main(String[] args) {
        Main m = new Main();
        m.name("I don't know this :P");
        System.out.println(m.color());
        m.work();
    }


}
