/**
 *
 * @author user
 */
public class week13lab1Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testInterface[] intObjects = new testInterface[2];
        intObjects[0] = new week13lab1Dice();
        intObjects[1] = new week13lab1Card();
        for (testInterface current : intObjects){
            int num = current.getNumber();
            System.out.println("Method num is "+ num);
            System.out.println("History num is "+ current.getHistory());
        }
            
        
    }
    
}
