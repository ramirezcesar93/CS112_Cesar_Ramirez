
import javax.swing.JOptionPane;


/**
 *
 * @author user
 */
public class ThreeDice {
    lab3week11_Dice D1 = new lab3week11_Dice();
    lab3week11_Dice D2 = new lab3week11_Dice();
    lab3week11_Dice D3 = new lab3week11_Dice();
    
    public int Throw(){
        int D1val = D1.Throw();
        int D2val = D2.Throw();
        int D3val = D3.Throw();
        return (D1val+D2val+D3val)/3;
    }
}