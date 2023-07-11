// Program Number 7

import java.util.Scanner;

public class Neon_no 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the NO> : ");

        int n = sc.nextInt();
       int sum=0;
        int square=n*n;
       
        while(square >0)
        {
            int digit = square%10;
            sum+=digit;
            square/=10;
        }

        if(sum==n)
        {
            System.out.println("This is a Neon NO.");
        }
        else
        {
            System.out.println("This is not a Neon NO.");
        }
    }
}
