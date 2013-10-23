/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oddoreven;

import java.util.Scanner;

public class TestObject {
    public static void main(String[] args){
        OddorEven testClass = new OddorEven();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = input.nextInt();
        testClass.setValue(number);
        testClass.OddEven();
    }
}
