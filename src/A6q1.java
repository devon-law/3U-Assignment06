
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lawd8918
 */
public class A6q1 {
    
    public static double circleArea(double radius){
        //find area using area of a circle formula
        double area = radius * radius * 3.14;
        return area;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle.");
        double radius = input.nextDouble();
        double area = circleArea(radius);
        Math.round(area);
        System.out.println("The area is " + area);
    }
}
