package oddoreven;

public class lab4week9 {

    private int m_val;

    public lab4week9() {
        m_val = 0 + (int) (Math.random() * 100);
    }

    public void setValue(int value) {
        m_val = value;
    }

    public void OddEven() {
        if (m_val % 2 == 0) {
            printEven();
        } else {
            printOdd();
        }
    }

    public void printOdd() {
        System.out.println("Odd");
    }

    public void printEven() {
        System.out.println("Even");
    }

}
