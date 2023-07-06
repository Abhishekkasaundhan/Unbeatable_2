import java.util.Scanner;

public class Special_No
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the NO> : ");

        int n = sc.nextInt();
        int m=n;
        int sum=0;
        int product=1;
        while(n>0)
        {
            int digit = n%10;

            sum+=digit;
            product*=digit;

            n/=10;
        }

        if(m==(sum+product))
        {
            System.out.println("This is a special NO.");
        }
        else
        {
            System.out.println("This is not a special NO.");
        }
    }
}
