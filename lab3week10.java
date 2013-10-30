
package guess.a.number;

/**
 *
 * @author Cesar
 */
public class lab3week10 {
    private int m_numThrows;
    int num;
    int total;
    int average;
    
    
    public lab3week10(int value){
        m_numThrows = value;
    }
    public lab3week10(){
        m_numThrows = 1;
    }
    
    public int Throw(){
        for (int i=0; i<m_numThrows;i++){
            num = 0 + (int)(Math.random()*6);
            total= total + num;
        }
        average = total/m_numThrows;
        return average;
    }
    
    public int Value(){
        return average;
    } 
    
}
