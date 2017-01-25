
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lawd8918
 */
public class A6q5 {

    public static int chaotic(int numLines) {
        
        int count = 0;
        while(count < numLines){
        //Find random number
        int randNum = (int) (Math.random() * 5 - 1 + 1) + 1;
        //Display * 
        if (randNum == 1) {
            System.out.println("*");
        }
        if (randNum == 2) {
            System.out.println("**");
        }
        if (randNum == 3) {
            System.out.println("***");
        }
        if (randNum == 4) {
            System.out.println("****");
        }
        if (randNum == 5) {
            System.out.println("*****");
        }
        
        count++;
        
    }
        return numLines;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many lines?");
        int numLines = input.nextInt();
                    
        chaotic(numLines);

        
    }
}
