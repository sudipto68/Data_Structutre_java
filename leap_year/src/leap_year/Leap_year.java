
package leap_year;

import java.util.Scanner;


public class Leap_year {

   
    public static void main(String[] args) {

        
        Scanner s = new Scanner(System.in);
        int yr = s.nextInt();
        
        if(yr%400==0 || (yr%4==0 && yr%100!=0))
            System.out.println(+yr+"is a leap year");
        else
            System.out.println(+yr+" is not leap year");

        

    }
    
}
