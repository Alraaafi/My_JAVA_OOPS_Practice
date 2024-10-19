public class A {
    public static class B
    {
        public int a;
        public String nm;
        public B()
        {
            a=5;
            nm = "gh";
        }
        void show()
        {
            System.out.println(a+"  "+nm);
        }
    }


        public static void main(String[] args)
        {
            B ref = new B();
            ref.show();
        }

}
