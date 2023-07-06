import java.util.*;
public class CountSpecificNumber {
    public static int CountSpecificNumbers(int m, int n) {
      
        if (m > n) {
            return -1;
        }

        int count = 0;
        
        for (int i=m; i<=n;i++) 
        {
         int num = i;
         boolean b=true;
          
         while (num > 0)
         {
            int digit = num % 10;
            
            if (digit!= 1 && digit!= 4 && digit!= 9)
            {
                b=false;
                break;
            }

            num /= 10;
         }
            
        if (b == true) 
        {
            count++;
        }
        }
        return count;
    }

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter the m : ");
	    int m=sc.nextInt();
	    System.out.print("Enter the n : ");
	    int n=sc.nextInt();
	   
        int result = CountSpecificNumbers(m, n);
        System.out.println( result);
    }
}
