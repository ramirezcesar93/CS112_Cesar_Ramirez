
package guess.a.number;

/**
 *
 * @author user
 */
public class lab3week10test {
    public static void main(String[] args){
        lab3week10 testObject = new lab3week10();
        System.out.println(testObject.Throw());
        System.out.println(testObject.Value());
        
        lab3week10 testObject1 = new lab3week10(3);
        System.out.println(testObject1.Throw());
        System.out.println(testObject1.Value());        
    }
}
