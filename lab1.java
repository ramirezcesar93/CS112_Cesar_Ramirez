package week15;


import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author user
 */
public class lab1 extends JFrame {

    public lab1() {
        setTitle("My Second Frame");
        setSize(300, 200);
        setLocation(200, 200);

        addWindowListener(new WindowAdapter() {

            public void windowDeiconified(WindowEvent e) {
                JOptionPane.showMessageDialog(null, " window deiconified!");
            }
        });
    }

    public static void main(String[] args) {
        JFrame f = new lab1();
        f.show();
    }

}
