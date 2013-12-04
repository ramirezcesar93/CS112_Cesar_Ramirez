package week15;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
class buttonpanel extends JPanel implements ActionListener {

    public void actionPerformed(ActionEvent e) {
// reaction to button click goes here
        Color color = getBackground();
        
        Object source = e.getSource();
        String com = e.getActionCommand();
        if (com.equals("RED") || com.equals("1")) {
            color = Color.red;
        } else if (com.equals("BLUE")) {
            color = Color.blue;
        } else if (com.equals("YELLOW")) {
            color = Color.yellow;
        }
        else if(com.equals("GRAY")){
            JOptionPane.showMessageDialog(null, "You pressed the Gray button!");
        }
        else if(com.equals("1")){
            JOptionPane.showMessageDialog(null, "You pressed the 1, you get a cookie!");
        }else if (com.equals("GREEN")) {
            color = Color.green;
        }else if (com.equals("BLACK")) {
            color = Color.black;
        }else if (com.equals("WHITE")) {
            JOptionPane.showMessageDialog(null, "You pressed the white button!");
        }else if (com.equals("PURPLE")) {
            color = Color.yellow;
        }else if (com.equals("PINK")) {
            color = Color.pink;
        }else if (com.equals("2")) {
            color = Color.orange;
        }else if (com.equals("3")) {
            color = Color.green;
        }else if (com.equals("4")) {
            color = Color.blue;
        }else if (com.equals("5")) {
            color = Color.yellow;
        }else if (com.equals("6")) {
            color = Color.cyan;
        }else if (com.equals("7")) {
            color = Color.pink;
        }else if (com.equals("8")) {
            color = Color.red;
        }else if (com.equals("9")) {
            color = Color.black;
        }
        setBackground(color);
        repaint(); // when do we need this??
    } // actionPerformed
// members:
    private JButton redButton;
    private JButton blueButton;
    private JButton yellowButton;
    private JButton greenButton;
    private JButton blackButton;
    private JButton whiteButton;
    private JButton grayButton;
    private JButton purpleButton;
    private JButton pinkButton;
    private JButton silverButton;
    String[] buttons = {
        "1", "2", "3", "4", "5", "6", "7", "8", "9"
    };
// constructors:

    public buttonpanel() {
        this.setLayout(new GridLayout(6, 3));
// create buttons
redButton = new JButton("RED");
        blueButton = new JButton("BLUE");
        yellowButton = new JButton("YELLOW");
        greenButton = new JButton("GREEN");
        blackButton = new JButton("BLACK");
        whiteButton = new JButton("WHITE");
        grayButton = new JButton("GRAY");
        purpleButton = new JButton("PURPLE");
        pinkButton = new JButton("PINK");
// add buttons to current panel
        add(redButton); // add button to current panel
        add(blueButton); // add button to current panel
        add(yellowButton); // add button to current panel
        add(greenButton); // add button to current panel
        add(blackButton); // add button to current panel
        add(whiteButton); // add button to current panel
        add(grayButton); // add button to current panel
        add(purpleButton); // add button to current panel
        add(pinkButton); // add button to current panel
// register the current panel as listener for the buttons
        redButton.addActionListener(this);
        blueButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);
        blackButton.addActionListener(this);
        whiteButton.addActionListener(this);
        grayButton.addActionListener(this);
        purpleButton.addActionListener(this);
        pinkButton.addActionListener(this);
        for (int i = 0; i < buttons.length; i++) {
            JButton bt = new JButton(buttons[i]);
            add(bt);
            bt.addActionListener(this);
        }
    } // ButtonPanel constructor
}
