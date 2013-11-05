
package guess.a.number;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class lab5week10test {
    public static void main(String[] args){
        int dices = Integer.parseInt(JOptionPane.showInputDialog("How may dice do you wanna throw?"));
        int bounces = 0 + (int)(Math.random()*10);
        lab5week10 testObject = new lab5week10(bounces);
        testObject.Throw(dices, bounces);
        JOptionPane.showMessageDialog(null, "With " + dices + " dices, your number is " + testObject.Value());
    }    
}
