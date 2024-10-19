package JAVA_PRACTICE_BY_BASIC_TUT_BANGLA.ABSTRACTION;

public class AbstructExample {
    abstract class Animal{
        abstract void color();
    }
    abstract class Bird extends Animal{
//abstract void color(); is present by default
    }
    class Crow extends Bird{
        @Override
        void color() {
            System.out.println("Black");
        }
    }

        public void main(String[] args) {
            //Animal animal = new Animal(); //This is not possible
            //Bird animal = new Bird(); //This is not possible
            Crow bird = new Crow();
            bird.color();
        }

}
