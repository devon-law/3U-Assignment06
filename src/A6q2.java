
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lawd8918
 */
public class A6q2 {
    
    public static int examGrade(int mark){                
        int grade = 0;
        
        if(mark < 50){
            grade = 1;
        }
        if(mark >= 50 && mark <= 59){
            grade = 2; 
        }
        if(mark >= 60 && mark <= 69){
            grade = 3; 
        }
        if(mark >= 70 && mark <= 79){
            grade = 4; 
        }
        if(mark >= 80){
            grade = 5;
        }
        
        return grade;
            
            
        }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your mark");
        
        int mark = input.nextInt();
        int grade = examGrade(mark);
        if(grade == 1){
            System.out.println("You receive an F");
        }
        if(grade == 2){
            System.out.println("You receive a D");
        }
        if(grade == 3){
            System.out.println("You receive a C");
        }
        if(grade == 4){
            System.out.println("You receive a B");
        }
        if(grade == 5){
            System.out.println("You receive an A");
        }
    }
}