
/**
 *
 * @author user
 */
public class lab8week11_ThreeDice extends lab8week11_Dice {
    public lab8week11_ThreeDice(int dices){
        super(dices);
    }

    @Override
    public int Throw(int dices, int bounces){
        int total = 0;
        int sumDices = 0;
        int average=0;
        for (int i = 0; i < dices; i++) {
                for (int k = 0; k < 3; k++) {
                    total += 1 + (int) (Math.random() * 5);
                }
                //Gives the number for each dice
               average = total / 3;
            //gives the total for all dices
            sumDices += average;
        }
        return sumDices;
    }
}