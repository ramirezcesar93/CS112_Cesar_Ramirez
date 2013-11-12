
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class lab8week11test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dices= Integer.parseInt(JOptionPane.showInputDialog("How many dices do you wanna throw?"));
        TrippleDicewithHistory testObject = new TrippleDicewithHistory(dices);
        int val = testObject.Throw(dices,0);
        JOptionPane.showMessageDialog(null, "The total of three dices are " + val);
        JOptionPane.showMessageDialog(null, testObject);
        
    }
    
}
