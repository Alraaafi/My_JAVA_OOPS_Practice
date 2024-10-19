package Java_assaignment_2;

public class StudentGetSet_problem_3 {
    public static  class student
    {
        public String str;
        public  int roll;

        void setValue(String s, int r)
        {
            str = s;
            roll = r;
        }

        int getRoll()
        {
            return roll;
        }
        String getStr()
        {
            return str;
        }

    }

    public static void main(String[] args) {
        student stuInfo  = new student();
        stuInfo.setValue("john",2);
        System.out.println("Name: "+stuInfo.getStr());
        System.out.println("Roll: "+stuInfo.getRoll());
    }
}
