/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgabstract;

/**
 *
 * @author user
 */
public class DoubleDice extends AbstractDice {
    private int value2;
    public DoubleDice(){
        value2=2;
    }
    @Override
    public int Throw(){
        return value2;
    }
    @Override
    public String toString(){
        return String.format("The value of Double Dice is "+ value2);
    }
}
