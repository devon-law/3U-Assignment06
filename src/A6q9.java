
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lawd8918
 */
public class A6q9 {
    

    public static void allDigitsOdd(String numGiven){  
        //length of number
        int length = numGiven.length();
        //test if number contains even digits
        for (int i = 0; i < length + 1; i++){                  
            if(numGiven.contains("0") || numGiven.contains("2") || numGiven.contains("4") || numGiven.contains("6") || numGiven.contains("8") ){
                System.out.println("False.");
                break;
            }else{
                //if all digits are false
                System.out.println("True.");
                break;
            }    
           
        }
            
                
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter in a number");
        String numGiven = input.nextLine();
        allDigitsOdd(numGiven);
    }
}
