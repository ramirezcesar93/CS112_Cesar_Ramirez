import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Cesar
 */
public class PaperScissorsRock {
   
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
           String inputUser = JOptionPane.showInputDialog("Rock, paper, or scissors?");
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
        Scanner replayInput = new Scanner(System.in);
        String userMove, computerMove;
        int outcome;
        int userScore=0;
        int compScore=0;
        int numGames;
        int maxGames;
        int currentGames=0;
        String input = JOptionPane.showInputDialog("Lets play PAPER, SCISSORS, ROCK! How many games do you want to play?");
        numGames = Integer.parseInt(input);
        maxGames = ((numGames/2)+1);        
        while (maxGames > userScore && maxGames >compScore && currentGames<numGames){
        
        userMove = getUserMove();
        computerMove = getComputerMove();
        JOptionPane.showMessageDialog(null, "\nYou played " + userMove);
        JOptionPane.showMessageDialog(null, "I played " + computerMove);
        outcome = compareMoves(userMove, computerMove);
        if (outcome==0){
            JOptionPane.showMessageDialog(null, "Ahh man we tied!");
            currentGames++;
        }
        else if(outcome== -1){
            JOptionPane.showMessageDialog(null, userMove + " beats " + computerMove + ". You WON! ");
            userScore++;
            currentGames++;
        }
        else {
            JOptionPane.showMessageDialog(null, computerMove + " beats " + userMove + ". You LOST!");
            compScore++;
            currentGames++;
            }
       
       }
        if (userScore>compScore){
            JOptionPane.showMessageDialog(null, "You won " + userScore + " out of " + numGames + " games. You are the WINNER!! :D ");
        }
        else if (compScore>userScore){
            JOptionPane.showMessageDialog(null, "The computer won " + compScore + " out of " + numGames + " games. You are the LOSER! :P");
        }
        else {
            JOptionPane.showMessageDialog(null, "You and the computer both won the same number of games. You TIED!");
        }
     }
}