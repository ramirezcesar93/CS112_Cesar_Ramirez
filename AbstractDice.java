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
public abstract class AbstractDice {
    private int value;
    public AbstractDice(){
        value = 0;
    }
    public String toString(){
        return String.format("The value is: " + value);
    }
    public abstract int Throw();
    
}
