import java.util.Scanner;

public class Jar_problem
{
    public static void main(String[] args) 
    {
   	 int N = 10, K = 5;
   	 int num;
   	 Scanner sc = new Scanner(System.in);
   	 num = sc.nextInt();
   	 
   	 if(num >= 1 && num <= 5)
   	 {
   		 System.out.println("NUMBER OF CANDIES SOLD : " + num);
   		 System.out.print("NUMBER OF CANDIES LEFT : " + (N - num));
   	 } 
   	 else
   	 {
   		 System.out.println("INVALID INPUT");
   		 System.out.print("NUMBER OF CANDIES LEFT : " + N);
     }
    }

}
