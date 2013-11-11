
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class lab3week11test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ThreeDice testObject = new ThreeDice();
        JOptionPane.showMessageDialog(null, "The average of three dices are " + testObject.Throw());
    }
    
}
