/**
 *
 * @author user
 */
public class week13lab1Dice implements testInterface{
    int hist[] = new int[100];
    int count=0;
    @Override
    public int getNumber(){
        int num = ((int)(Math.random()*6));
        hist[count]=num;
        count++;
        return num;
    }
    @Override
    public String getHistory(){
        String result = "Dice: ";
        for (int i=0;i<count;i++){
            result += hist[i] + ",";
        }
        return result;
    }
}
