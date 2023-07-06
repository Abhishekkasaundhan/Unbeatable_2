import java.util.Scanner;

public class Automorphic_no
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the NO> : ");

        int n = sc.nextInt();
     
        int square=n*n;
        boolean b= true;
        while(n >0)
        {
           if(n%10 != square%10)
           {
            b=false;
            break;
           }
           
            n/=10;
            square/=10;
        }

        if(b==true)
        {
            System.out.println("This is a Automorphic NO.");
        }
        else
        {
            System.out.println("This is not a Automorphic NO.");
        }
    }
 }
