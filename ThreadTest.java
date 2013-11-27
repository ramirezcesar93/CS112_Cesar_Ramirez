/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class ThreadTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Start!");
        for (int i=0;i<25;i++){
            Runnable T1 = new Dice();
            Thread worker = new Thread(T1);
            worker.setName("Thread number is "+(i+1));
            System.out.println(worker.getName());
            worker.start();
        }
        System.out.println("Complete!");
    }
    
}
