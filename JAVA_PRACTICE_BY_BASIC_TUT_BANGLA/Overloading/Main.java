package JAVA_PRACTICE_BY_BASIC_TUT_BANGLA.Overloading;

public class Main {
    private int initialNumber;
    private int terminalNumber;
    public Main(int initialNumber, int terminalNumber) {
        this.initialNumber = initialNumber;
        this.terminalNumber = terminalNumber;
    }
    public Main(int terminalNumber) {
        this(0, terminalNumber);
    }
    public Main() {
        this(0, 100);
    }
    public void showNumbers() {
        System.out.println("First Number: " + this.initialNumber + ", Second Number: " +this.terminalNumber);
    }
    public static void main(String[] args) {
        Main m = new Main(1, 5);
        m.showNumbers();
        Main m2 = new Main(5);
        m2.showNumbers();
        Main m3 = new Main();
        m3.showNumbers();
    }
}