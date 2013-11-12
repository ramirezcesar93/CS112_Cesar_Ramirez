
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class lab6week11test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        lab6week11_ThreeDice testObject = new lab6week11_ThreeDice(3);
        int bounces = 1 + (int)(Math.random()*4);//Simulates bounces in real life
        int val = testObject.Throw(bounces);
        JOptionPane.showMessageDialog(null, "The total of three dices are " + val);
    }
    
}
