package Java_Eshikon;

public class Exception_handeling {

    public static void main(String[] args) {


        try {
            int  a = 11/0;
        }

        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
