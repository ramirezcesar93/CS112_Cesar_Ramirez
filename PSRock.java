package psrock;
import java.util.Scanner;
/**
 *
 * @author Cesar
 */
public class PSRock {
   
static String getComputerMove(){
        int compMoveInt;
	String compMove;
	compMoveInt = (int)(Math.random()*3);
	if (compMoveInt == 1) {
	    compMove = "ROCK";
	}
	else if (compMoveInt == 2) {
	    compMove = "PAPER";
	}
	else {
	    compMove = "SCISSORS";
	}

	return compMove;
    }
    
    static String getUserMove(){
           Scanner input = new Scanner(System.in);
           System.out.println("Rock, paper, or scissors?");
           String inputUser = input.nextLine();
           inputUser = inputUser.toUpperCase();
           char firstLetter= inputUser.charAt(0);
           if (firstLetter == 'R'){
               return inputUser;
           }
           else if (firstLetter=='P') {
               return inputUser;
           }
           else if (firstLetter=='S'){
               return inputUser;
           }
           else {
               return getUserMove();
           }
        }
    
    static int compareMoves(String userMove, String compMove) {
	int winner;
	if (compMove.equals(userMove)) {
	    winner = 0;
	}
	else if (compMove.equals("ROCK") && 
		 userMove.equals("SCISSORS")) {
	    winner = 1;
	}
	else if (compMove.equals("PAPER") &&
		 userMove.equals("ROCK")) {
	    winner = 1;
	}
	else if (compMove.equals("SCISSORS") &&
		 userMove.equals("PAPER")) {
	    winner = 1;
	}
	else {
	    winner = -1;
	}

	return winner;
    }
    
   

     public static void main(String[] args) {
        int newGame= 1;
        while (newGame != 0){
        String userMove, computerMove;
        int outcome;
        System.out.println("Lets play PAPER, SCISSORS, ROCK!");
        userMove = getUserMove();
        computerMove = getComputerMove();
        System.out.println("\nYou played " + userMove);
        System.out.println("I played " + computerMove);
 
       
       
        outcome = compareMoves(userMove, computerMove);
        if (outcome==0){
            System.out.println("Ahh man we tied!"); 
        }
        else if(outcome== -1){
            System.out.println(userMove + " beats " + computerMove + ". You are a WINNER! :D ");
        }
        else {
            System.out.println(computerMove + " beats " + userMove + ". You are a LOSER");
            }
       System.out.println("Do you wanna play again? Y/N:");
       Scanner replayInput = new Scanner(System.in);
       String replay = replayInput.nextLine();
       replay = replay.toUpperCase();
       char firstLetter = replay.charAt(0);
       if (firstLetter=='N'){
           newGame = 0;
           System.out.println("Thank you for playing, Goodbye!");

       }
       else {
           newGame= 1;
       }
        }
     }
}

