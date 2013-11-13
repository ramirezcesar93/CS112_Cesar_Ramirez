/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgabstract;
public class TrippleDice extends AbstractDice{
    private int value3;
    public TrippleDice(){
        value3=3;
    }
    @Override
    public int Throw(){
        return value3;
    }
    @Override
    public String toString(){
        return String.format("The value of Tripple dice is "+ value3);
    }
}
