
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lawd8918
 */
public class A6q7 {
    
    public static int firstDigit(int numGiven) {
         
        //make positive if it is negative
        if (numGiven < 0){
            numGiven = numGiven * (-1);
        }
        //Make into a string
        String numFirst = "" + numGiven;
        
        //Find first character in string      
        System.out.println("" + numFirst.charAt(0));
        return numGiven;
    }
      
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter in number.");
        int numGiven = input.nextInt();
        firstDigit(numGiven);
    }
}
