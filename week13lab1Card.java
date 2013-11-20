/**
 *
 * @author user
 */
public class week13lab1Card implements testInterface{
    @Override
    public int getNumber(){
       int num= (int)(Math.random()*13);
       return num;
    }
}
