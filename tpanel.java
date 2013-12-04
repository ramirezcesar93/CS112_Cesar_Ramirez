package week15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author user
 */
public class tpanel extends JPanel {
// override the paintComponent method

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Font f = new Font("SansSerif", Font.BOLD, 14);
        Font fi = new Font("SansSerif", Font.BOLD + Font.ITALIC, 14);
        FontMetrics fm = g.getFontMetrics(f);
        FontMetrics fim = g.getFontMetrics(fi);
        int cx = 75;
        int cy = 100;
        g.setFont(f);
        g.drawString("Hello, ", cx, cy);
        cx += fm.stringWidth("Hello, ");
        g.setFont(fi);
        g.drawString("Cesar!", cx, cy);
    } //paintComponent

    public static void main(String[] args){
    JFrame test =  new lab3("Lab 3");
    test.show();
}
}