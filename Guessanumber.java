package guessanumber;

/**
 *
 * @author Cesar
 */
import java.util.Scanner;
public class Guessanumber {

    
    public static void main(String[] args) {
        int endGame=1;
        int num1;
        int computerNum;
        int numMoves = 0;
        int arrayCounter = 0;
        int compScore = 0;
        int userScore =0;
        int compMoves[] = new int[100];
        int userMoves[] = new int[100];
        while (endGame!=0){
            Scanner input = new Scanner(System.in);
            computerNum = 0 + (int) (Math.random() * 10 );
            System.out.println ("Lets play a game, Im thinking of a number between 1 and 10, guess a number:");
            num1 = input.nextInt();
            if (num1==0){
                System.out.println("YOU CANNOT ENTER 0, Enter another number:");
                num1 = input.nextInt();
            }
            compMoves[arrayCounter] = computerNum;
            userMoves[arrayCounter] = num1;
            arrayCounter++;            
            if (num1>computerNum) {
                System.out.println("Too High! Do you wanna keep playing? Enter 1 for YES and 0 for NO.");
                endGame = input.nextInt();
                compScore++;
            }
            else if(num1<computerNum) {
                System.out.println("Too low! Do you wanna keep playing? Enter 1 for YES and 0 for NO.");
                endGame = input.nextInt();
                compScore++;
            }
            else {
                System.out.println("You guessed it! :D. Do you wanna keep playing? Enter 1 for YES and 0 for NO.");
                endGame = input.nextInt();
                userScore++;
            }
            numMoves++;
        }
        System.out.println("Results:");
        for (int i=0; i<numMoves; i++){           
            System.out.println("Game: " + (i+1) + ". Computer played: " + compMoves[i] + ". User played: " + userMoves[i]);
        }
        if (userScore>compScore){
            System.out.println("You won more games than the computer! You are a WINNER!");
        }
        else {
            System.out.println("The computer won more games than you! You are a LOSER!");
        }
        System.out.println("Thank you for playing Guess the Number, Goodbye!");   
            
     }
}

// Good
