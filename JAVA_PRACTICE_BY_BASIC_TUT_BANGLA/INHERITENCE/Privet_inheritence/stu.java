package JAVA_PRACTICE_BY_BASIC_TUT_BANGLA.INHERITENCE.Privet_inheritence;

public class stu extends info {
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    void display()
    {
        System.out.println("NAME: "+getName());
        System.out.println("AGE: "+getAge());
        System.out.println("ID: "+getId());
        System.out.println("\n\n");
    }
}
