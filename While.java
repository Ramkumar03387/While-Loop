import java.util.Scanner;

import java.util.Scanner;
 
public class While{
    private static Scanner sc;
     
    public static void main(String[] args) {
        int number, sum = 0;
        sc = new Scanner(System.in);    
         
        System.out.println("n Please Enter any integer Value below 10: ");
        number = sc.nextInt();
         
        while (number <= 10)  {
            sum = sum + number;
            number++;
        }
        System.out.format(" Sum of the Numbers From the While  Loop is: %d ", sum);
    }
}