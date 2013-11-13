/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgabstract;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class TestAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoubleDice dice2= new DoubleDice();
        TrippleDice dice3 = new TrippleDice();
        JOptionPane.showMessageDialog(null, "Throwing Doubledice: " + dice2.Throw());
        JOptionPane.showMessageDialog(null,"Throwing TrippleDice: " + dice3.Throw());
        JOptionPane.showMessageDialog(null, dice2);
        JOptionPane.showMessageDialog(null, dice3);
    }
    
}
