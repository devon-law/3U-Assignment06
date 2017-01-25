
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lawd8918
 */
public class A6q3 {

    public static int factors(int factor) {
        int i = 1;
        
        //go through integer and determine factors
        while (i <= factor) {
            if (factor % i == 0) {
                System.out.println(i + " is a factor.");
            }
            i++;
        }
        return factor;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter in a number to be factored.");

        int factor = input.nextInt();
        int list = factors(factor);

    }
}
