
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lawd8918
 */
public class A6q4 {
    
    public static double compoundInterest(double principle, double rate, double year){
        //determine compound interest
        double balance = principle * Math.pow((1 + rate), year);
        //round answer to get valid currency decimals
        balance = Math.round(balance*100)/100.0;
        
        return balance;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double balance = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principle.");
        double principle = input.nextDouble();
        System.out.println("Enter Interest rate.");
        double rate = input.nextDouble();
        System.out.println("Enter number of years.");
        double year = input.nextDouble();
        balance = compoundInterest(principle, rate, year);
    }
}
