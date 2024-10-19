package JAVA_PRACTICE_BY_BASIC_TUT_BANGLA.Final_key;

public class Final_key_typ {

    public class info
    {
        final String UNIVERSITY = "BSFMSTU"; //direct final variable after no change
        final int year; // blank final variable, use by constructor

        static final int AREA ; //blank static final variable
        info(){
            year = 2017;
        }

        static
        {
            AREA = 570;
        }

        void display()
        {
            System.out.println("UNIVERSITY NAME : "+ UNIVERSITY);
            System.out.println("STABILISED YEAR : "+ year);
            System.out.println("AREA OF UNIVERSITY : "+ AREA);
        }

    }

    public  void main(String[] args) {
        info uv = new info();
        uv.display();
    }

}
