
/**
 *
 * @author user
 */
public class week11hw extends lab8week11_ThreeDice implements Cloneable{

    public week11hw(int dices) {
        super(dices);
    }
    @Override
     public Object clone() throws CloneNotSupportedException {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
     }
    int throwValues[] = new int[100];
    int numThrows = 0;
    String history = "";

    @Override
    public int Throw(int dices, int bounces) {

        int num = 0;
        int diceval;
        int diceavg = 0;
        int totalSum = 0;
        for (int i = 0; i < dices; i++) {
            for (int j = 0; j < 3; j++) {
                diceval = (int) (Math.random() * (6 - 1)) + 1;
                num = diceval + num;
                storeThrow(diceval);
            }
            diceavg = num / 3;

            totalSum += diceavg;
        }
        return totalSum;
    }

    public void storeThrow(int diceNum) {
        throwValues[numThrows] = diceNum;
        numThrows++;

    }

    @Override
    public String toString() {

        for (int i = 0; i < numThrows; i++) {
            history += "On throw: " + (i + 1) + " The value was: " + throwValues[i] + "\n";
        }
        return history;
    }
}

