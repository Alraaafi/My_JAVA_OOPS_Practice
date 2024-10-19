package JAVA_PRACTICE_BY_BASIC_TUT_BANGLA.Files;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class TestFile {
    public static void main(String[] args) {

        //file create....
        File dir = new File("D:\\CODING\\JAVA\\Java_Practice_by_JetBrain1\\src\\JAVA_PRACTICE_BY_BASIC_TUT_BANGLA\\Files\\newFolder");
        dir.mkdir();

        String loc = dir.getAbsolutePath();
        System.out.println("THE LOCOATION IS: "+loc);

        File file1 = new File(loc+"//rafi.txt");
        File file2 = new File(loc+"//info.txt");

        try
        {
            file1.createNewFile();
            file2.createNewFile();

            System.out.println("Files Are Created!");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        if(file1.exists()) System.out.println("File is Exist!");

        //File Write...

        int num;
        String name,id;

        Scanner scn = new Scanner(System.in);

        System.out.print("How many Member you Collect in File: ");
        num = scn.nextInt();

        try {
            Formatter form = new Formatter(file2.getAbsoluteFile());

            for(int i=1; i<num; i++)
            {
                System.out.print("Enter Name And ID: ");
                name = scn.next();
                id = scn.next();

                form.format("%s %s \r\n",name,id);
                //form.format("%d \r\t ",i);
            }

            form.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        //File Read....

        try{

            String ss = file1.getAbsolutePath();
            File fileTest = new File(ss);

            Scanner fileScn = new Scanner(file1);

            while(fileScn.hasNext())
            {
                String nam = fileScn.next();
                String ID = fileScn.next();

                System.out.println("NAME: "+nam+" AND ID: "+ID);


            }
            fileScn.close();
        }
        catch (Exception r)
        {
            System.out.println(r);
        }

        //if(dir.delete()) System.out.println("FILE HAS BEEN DELETED!!");
    }
}
