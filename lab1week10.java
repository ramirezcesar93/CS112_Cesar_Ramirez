
package guess.a.number;

/**
 *
 * @author Cesar
 */
public class lab1week10 {
    private int m_diceValue;
    public int Throw(){
        m_diceValue = 0 + (int)(Math.random()*6);
        return m_diceValue;
    }
    public int Value(){
        return m_diceValue;
    } 
    
}
