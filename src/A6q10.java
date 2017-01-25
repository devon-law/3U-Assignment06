
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lawd8918
 */
public class A6q10 {

    public static int sameDashes(String wordOne, String wordTwo) {


        int length1 = wordOne.length();
        int length2 = wordTwo.length();
        int length = 0;
        int count = 0;
            
        //Determine shorter string and see if longer string has dashes after shorter string has ended
            //String 1 is shorter
            if (length1 < length2) {
                length = length1;
                String extra = wordTwo.substring(length1);
                if (extra.contains("-")) {
                    return 0;
                }
            }
            //String 2 is shorter
            if (length2 < length1) {
                length = length2;
                String extra2 = wordOne.substring(length2);
                if (extra2.contains("-")) {
                    return 0;
                }
            }
            
            //Both strings are the same length
            if (length1 == length2) {
                length = length1;
            }
            
            //Check if strings have dashes in the same place
            for (count = 0; count < length; count++) {
                //strings do not have dashes in the same places
                if (wordOne.charAt(count) != '-' && wordTwo.charAt(count) == '-' || wordOne.charAt(count) == '-' && wordTwo.charAt(count) != '-') {
                    return 0;
                }
            }
            //strings do have dashes in the same place
            if (count == length) {
                return 1;
            }
        
        return 1;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Word One.");
        String wordOne = input.nextLine();
        System.out.println("Please Enter Word Two.");
        String wordTwo = input.nextLine();

        //sameDashes(wordOne, wordTwo);
        int answer = sameDashes(wordOne, wordTwo);
        if (answer == 0) {
            System.out.println("False.");

        } else {
            System.out.println("True.");
        }

    }
}
