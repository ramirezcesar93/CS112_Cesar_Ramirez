package oddoreven;


public class OddorEven {
    private int m_val;
    public void setValue(int value)
    {
        m_val = value;
    }
    public void OddEven()
    {
        if (m_val%2==0)
        {
            printEven();
        }
        else 
        {
            printOdd();
        }
    }
    public void printOdd()
    {
        System.out.println("Odd");
    }
    public void printEven()
    {
        System.out.println("Even");
    }
    
  
}
