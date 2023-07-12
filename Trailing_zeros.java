//problem number 13
import java.util.Scanner;

public class Trailing_zeros
{

    public static int count_tz(int n)
    {
        int count = 0;
        for (int i = 5; i <= n; i=i*5) 
        {
            count = count + (n/ i);
            
            System.out.println(n + " / " + i + " : " + (n/i));
        }
        return count;
    }
     public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int n = scanner.nextInt();
        
        int tz = count_tz(n);
        
        System.out.println("\n" + n + "! contains " + tz + " trailing zeros");

    }
}