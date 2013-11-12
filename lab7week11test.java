
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class lab7week11test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dices =3;
        lab7week11_ThreeDice testObject = new lab7week11_ThreeDice(dices);
        int bounces = 1 + (int)(Math.random()*4);//Simulates bounces in real life
        int val = testObject.Throw(dices, bounces);
        JOptionPane.showMessageDialog(null, "The total of three dices are " + val);
        JOptionPane.showMessageDialog(null, testObject);
    }
    
}
