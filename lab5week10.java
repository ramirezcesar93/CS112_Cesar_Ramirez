
package guess.a.number;

/**
 *
 * @author Cesar
 */
public class lab5week10 {
    int num=0;
    int total=0;
    int average;
    int sumDices=0;
    int bounces;
    
    public lab5week10(int numBounces){
       bounces  = numBounces;
    }
    
    public int Throw(int dices, int bounces){
        for (int i=0; i<dices;i++){
            if (bounces==1){
                total = 0 + (int)(Math.random()*6);
            }
            else {
                for (int k=0; k<bounces;k++){
                     num = 0 + (int)(Math.random()*6);
                     total+= num;
                }
                //Gives the number for each dice
                average = total/bounces;
            } 
            //gives the total for all dices
            sumDices += average;
        }
        return sumDices;
    }
    
    public int Value(){
        int dicesSum = sumDices;
        return dicesSum;
    } 
    
}
