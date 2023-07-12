// Problem number 14
import java.util.*;
public class prime_factor_problem
 { 
    public static boolean is_Valid_Number(int no)
    {
        while (no % 2 == 0)
         {
            no /= 2; 
        }
        while (no % 3 == 0) 
        {
            no /= 3;    
        }
        while (no % 5 == 0) 
        {
            no /= 5;
        }  
        return no == 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int nth = sc.nextInt(); 

        int count = 0;
        int num = 1;

        while (count < nth) {
            if (is_Valid_Number(num)) 
            {
                count++;
            }
            num++;
        }
        System.out.println("The " + nth + "th no. which contains prime factors 1, 2, 3,& 5 only is: " + (num - 1));
    }

}
