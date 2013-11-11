
/**
 *
 * @author user
 */
public class lab5week11_ThreeDice extends lab5week11_Dice {

    @Override
    public int Throw(){
        int sum=0;
        int val;
        for (int i=0; i<3;i++){
            val = 1+(int)(Math.random()*5);
            sum += val;
        }
        return sum/3;
    }
}