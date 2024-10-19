package JAVA_Assignment_3;
//Md. Tanvir Ahmed Rafi
public class HOMEWORK_2 {
    public  static class  Vehicle
    {
        void drive()
        {
            System.out.println("Repairing a vehicle!");
        }
    }
    public static class Car extends  Vehicle
    {
        void drive()
        {
            System.out.println("Repairing a car!");
        }
    }

    public static void main(String[] args) {
        Car obj = new Car();
        obj.drive();
    }

}
