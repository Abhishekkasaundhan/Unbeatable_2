import java.util.Scanner;

public class Spy_No
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the NO> : ");

        int n = sc.nextInt();
       
        int sum=0;
        int product=1;
        while(n>0)
        {
            int digit = n%10;

            sum+=digit;
            product*=digit;

            n/=10;
        }

        if(sum==product)
        {
            System.out.println("This is a spy NO.");
        }
        else
        {
            System.out.println("This is not a spy NO.");
        }
    }
    
}
