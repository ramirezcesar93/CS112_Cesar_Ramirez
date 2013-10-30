
package guess.a.number;

/**
 *
 * @author Cesar
 */
public class lab2week10 {
    int value[] = new int[100];
    int arrayCounter=0;
    private int m_total=0;
    int average;
    public int Throw(int bounces){
        for (int i=0; i<bounces;i++){
            value[i] = 0 + (int)(Math.random()*6);
            m_total= m_total +value[i];
        }
        average = m_total/bounces;
        return average;
    }
    public int Value(){
        return average;
    } 
    
}
