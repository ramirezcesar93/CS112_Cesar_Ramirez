package guess.a.number;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class week10hwtest {

    public static void main(String[] args) {
        int turns = 0;
        int userScore = 0;
        int compScore = 0;
        int play = 1;
        JOptionPane.showMessageDialog(null, "Welcome to the Dice Game!");
        while (play != 0) {
            int dices = Integer.parseInt(JOptionPane.showInputDialog("How may dice do you wanna throw?"));
            //Creates random number to simulate number of bounces in real world
            int bounces = 0 + (int) (Math.random() * 10);
            week10hw testObject = new week10hw(bounces, dices);
            int userGuess = Integer.parseInt(JOptionPane.showInputDialog("Enter your guess:"));
            testObject.storeUser(userGuess, turns);
            int compGuess = testObject.Throw();
            testObject.storeComp(compGuess, turns);
            if (userGuess == compGuess) {
                JOptionPane.showMessageDialog(null, "You guessed it! You win!");
                userScore++;
            } else {
                JOptionPane.showMessageDialog(null, "You got it wrong, You lose!");
                compScore++;
            }
            turns++;
            System.out.println(turns);
            play = Integer.parseInt(JOptionPane.showInputDialog("Do you wanna continue playing? Enter 1 for yes, 0 for no"));
            if (play == 0) {
                if (userScore > compScore) {
                    JOptionPane.showMessageDialog(null, "You are the winner!");
                } else if (userScore == compScore) {
                    JOptionPane.showMessageDialog(null, "You and the computer tied!");
                } else {
                    JOptionPane.showMessageDialog(null, "You are the loser!");
                }
                JOptionPane.showMessageDialog(null, "Thank you for playing the results were: ");
                testObject.displayMoves(turns);
            }
        }

    }

}
