package Java_assaignment_2;
import java.util.*;
public class student_details_Problem_1 {
    public static class student
    {
        private int id;
        private double score;

        student(int i, double sc)
        {
            id = i;
            score = sc;
        }

        void display()
        {
            System.out.println("ID of Student:  "+id);
            System.out.println("SCORE of Student:  "+score);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        student[] info = new student[3];
        int stuId,i;
        double stuSc;

        for (i=0; i<3; i++)
        {
            System.out.println("Enter Student- " + (i+1) + " ID and SCORE: ");
            stuId = scn.nextInt();
            stuSc = scn.nextDouble();
            info[0] = new student(stuId,stuSc);
        }

        for (i=0; i<3; i++)
        {
            System.out.println("Display Student- " + (i+1) + " Information: ");
            info[0].display();


        }
        //System.out.println("SUCSESS!");
    }
}
