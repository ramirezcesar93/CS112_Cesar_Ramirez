/**
 *
 * @author user
 */
public class week13lab1Dice implements testInterface{
    @Override
    public int getNumber(){
        int num = ((int)(Math.random()*6));
        return num;
    }
}
