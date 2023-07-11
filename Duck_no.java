// Program Number 6

import java.util.Scanner;

public class Duck_no 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the NO> : ");

        int n = sc.nextInt();
        int m=n;
        boolean b=false;
        while(n>0)
        {
            int digit = n%10;

           if(digit == 0)
           {
            b=true;
            break;
           }
            n/=10;
        }

        if(b==true)
        {
            System.out.println("This is a Duck No.");
        }
        else
        {
            System.out.println("This is not a Duck NO.");
        }
    }
}
