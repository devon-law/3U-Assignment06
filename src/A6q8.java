
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lawd8918
 */
public class A6q8 {
    
    public static void season(int month, int day){
      //months 12(>16),1,2,3(<15)= winter
      //months 3(>16),4,5,6(<15)= spring
      //months 6(>16),7,8,9(<15)= summer
      //months 9(>16),10,11,12(>15)= fall
      while(month == 12){
          if(day >= 16){
              month = 1;
          }
          if(day <= 15){
              month = 10;
          }
      }
      while(month == 3){
           if(day >= 16){
              month = 4;
          }
          if(day <= 15){
              month = 1;
          }
      }
      while(month == 6){
          if(day >= 16){
              month = 7;
          }
          if(day <= 15){
              month = 4;
          }
      }
      while(month == 9){
          if(day >= 16){
              month = 10;
          }
          if(day <= 15){
              month = 7;
          }
      }
        if( month == 1 || month == 2){
            System.out.println("Winter");            
        }
        
        if(month == 4 || month == 5){
            System.out.println("Spring");
        }
        if(month == 7 || month == 8 ){
            System.out.println("Summer");
        }
        if(month == 10 || month == 11){
            System.out.println("Fall");
        }
        
    }

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the month.");
        int month = input.nextInt();
        System.out.println("Please enter the day.");
        int day = input.nextInt();
        
        season(month, day);
        
    }
}
