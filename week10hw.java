package guess.a.number;

import javax.swing.JOptionPane;

/**
 *
 * @author Cesar
 */
public class week10hw {

    int num = 0;
    int total = 0;
    int average;
    int sumDices = 0;
    int bounces =0;
    int dices =0;

    public week10hw(int numBounces, int numDices) {
        bounces = numBounces;
        dices = numDices;
    }

    public int Throw() {
        for (int i = 0; i < dices; i++) {
            if (bounces == 1) {
                total = 0 + (int) (Math.random() * 6);
            } 
            else {
                for (int k = 0; k < bounces; k++) {
                    num = 0 + (int) (Math.random() * 6);
                    total += num;
                }
                //Gives the number for each dice
                average = total / bounces;
            }
            //gives the total for all dices
            sumDices += average;
        }
        return sumDices;
    }

    public int Value() {
        int dicesSum = sumDices;
        return dicesSum;
    }
    
    int userMoves [] = new int[100];
    public void storeUser(int choice, int turns){
        userMoves[turns] = choice;
    }
    int compMoves[] = new int[100];
    public void storeComp(int choice, int turns){
        compMoves[turns] = choice;
    }
    public void displayMoves(int turns){
        for (int i=0;i<turns;i++){
            JOptionPane.showMessageDialog(null, "On game " + (i+1) + ": User played " + userMoves[i] + " . Computer played " + compMoves[i] + ".");
        }
    }

}
