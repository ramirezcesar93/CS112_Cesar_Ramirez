
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class lab5week11test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        lab5week11_ThreeDice testObject = new lab5week11_ThreeDice();
        JOptionPane.showMessageDialog(null, "The average of three dices are " + testObject.Throw());
    }
    
}
