package week15;

import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author user
 */
public class lab3 extends JFrame {

    public lab3(String s) {
        setTitle(s);
        setSize(400, 400);
        setLocation(200, 200);

        addWindowListener(new WindowAdapter() {

            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });
        Container contentPane = getContentPane();
        contentPane.add(new buttonpanel());
    }//end constructor
}