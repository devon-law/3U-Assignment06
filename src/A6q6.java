
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lawd8918
 */
public class A6q6 {

    public static int lastDigit(int numGiven) {
        //find last digit
        int numLast = numGiven % 10;

        //make it positive
        if (numLast < 0) {
            numLast = numLast * (-1);
        }
        
        return numLast;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number.");
        int numGiven = input.nextInt();
        int numLast = lastDigit(numGiven);
        System.out.println("The last digit is " + numLast);

    }
}
