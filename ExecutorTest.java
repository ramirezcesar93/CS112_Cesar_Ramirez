
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class ExecutorTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Starting Executor");
        ExecutorService threadExecutor = Executors.newCachedThreadPool();

        for (int i=0;i<25;i++){
            Dice d = new Dice(String.valueOf((i+1)));
            threadExecutor.execute(d);
        }
        threadExecutor.shutdown();
        System.out.println("Task Started, Main ends\n");
    }
    
}
