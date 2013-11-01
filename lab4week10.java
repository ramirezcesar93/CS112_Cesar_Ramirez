
package guess.a.number;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class lab4week10 {
    static int num;
    
    public static void OneThrow(){
        num = (int)(Math.random()*6);
        JOptionPane.showMessageDialog(null, "The number is " + num);
    }
    
}
