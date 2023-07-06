import java.util.Scanner;

public class Harshad_no 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the NO> : ");

        int n = sc.nextInt();
        int m=n;
        int sum=0;
       
        while(n>0)
        {
            int digit = n%10;

            sum+=digit;
             n/=10;
        }

        if((m%sum)==0)
        {
            System.out.println("This is a Harshad NO.");
        }
        else
        {
            System.out.println("This is not a Harshad NO.");
        }
    }
    
}
