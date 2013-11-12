
/**
 *
 * @author user
 */
public class lab7week11_ThreeDice extends lab7week11_Dice {
    public lab7week11_ThreeDice(int dices){
        super(dices);
}

    @Override
    public int Throw(int dices, int bounces){
        int total = 0;
        int sumDices = 0;
        int average=0;
        for (int i = 0; i < dices; i++) {
            if (bounces == 1) {
                total = 0 + (int) (Math.random() * 6);
            } 
            else {
                for (int k = 0; k < bounces; k++) {
                    total += 1 + (int) (Math.random() * 5);
                }
                //Gives the number for each dice
               average = total / bounces;
            }
            //gives the total for all dices
            sumDices += average;
        }
        return sumDices;
    }
}