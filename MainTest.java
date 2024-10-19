
public class MainTest {
    public static class Animal
    {
        void makeSound()
        {
            System.out.println("Bark");
        }
    }
    public static class Cat extends Animal
    {
        void makeSound(){
            System.out.println("hey I am a cat!I am not Bark");  }
    }


        public static void main(String[] args)
        {
            Animal r=new Cat();
            r.makeSound();
        }

}