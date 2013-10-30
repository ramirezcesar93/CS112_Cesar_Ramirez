
package guess.a.number;

/**
 *
 * @author user
 */
public class lab2week10test {
    public static void main(String[] args){
        int val1;
        int val2;
        lab2week10 testObject = new lab2week10();
        val1 = testObject.Throw(3);
        val2 = testObject.Value();
        System.out.println(val1);
        System.out.println(val2);
    }
}
