
import javax.swing.JOptionPane;

public class lab5week11_Dice {

    private int diceNum;
    private int mBounces;
    private int average;
    static int num = 0;
    private int userGuess[] = new int[100];
    private int diceValue[] = new int[100];

    public lab5week11_Dice() {
        mBounces = 1;
    }

    public lab5week11_Dice(int bounces) {
        mBounces = bounces;
    }

    public int Throw() {
        int sum = 0;
        int diceVal;
        for (int a = 0; a < mBounces; a++) {
            diceVal = (int) (Math.random() * 6 + 1);
            sum += diceVal;
        }
        average = sum / mBounces;
        return average;
    }

    public int value() {
        return average;
    }

    public int Throw(int bounces) {
        int sum = 0;
        for (int a = 0; a < bounces; a++) {
            diceNum = (int) (Math.random() * 6 + 1);
            sum += diceNum;
        }
        average = sum / bounces;
        return average;
    }

    public int Throw(int dices, int bounces) {
        int total = 0;
        int sumDices = 0;
        for (int i = 0; i < dices; i++) {
            if (bounces == 1) {
                total = 0 + (int) (Math.random() * 6);
            } else {
                for (int k = 0; k < bounces; k++) {
                    diceNum = 0 + (int) (Math.random() * 6);
                    total += diceNum;
                }
                //Gives the number for each dice
                average = total / bounces;
            }
            //gives the total for all dices
            sumDices += average;
        }
        return sumDices;
    }

    public static void oneThrow() {
        num = (int) (Math.random() * 6);
        JOptionPane.showMessageDialog(null, "The number is " + num);
    }

    public void history(int user[], int computer[]) {
        for (int a = 0; a < 100; a++) {
            userGuess[a] = user[a];
            diceValue[a] = computer[a];
        }
    }

    public void displayHistory(int games) {
        for (int i = 0; i < games; i++) {
            JOptionPane.showMessageDialog(null, "On game " + (i+1) + " . User guess:" + userGuess[i]);
            JOptionPane.showMessageDialog(null, "On game " + (i+1) + " . Dice value:" + diceValue[i]);
        }
    }
}
