
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class week11hwtest {

    /**
     * @param args the command line arguments
     * @throws java.lang.CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        int dices= Integer.parseInt(JOptionPane.showInputDialog("How many dices do you wanna throw?"));
        week11hw testObject = new week11hw(dices);
        week11hw cloneObject =(week11hw)testObject.clone();
        int val = testObject.Throw(dices,0);
        JOptionPane.showMessageDialog(null, "The total of three dices are " + val);
        
        if (testObject.equals(cloneObject)){
            JOptionPane.showMessageDialog(null, "Clone is equal to test Object");
        } else {
            JOptionPane.showMessageDialog(null, "Clone is not equal to test Object");
        }
        
    }
    
}
