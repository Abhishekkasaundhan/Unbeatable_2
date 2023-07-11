// Program Number 11

import java.util.*;
public class Balance_the_fruits{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter the no. of apples : ");
	    int a=sc.nextInt();
	    System.out.print("Enter the no. of mangoes :");
	    int m=sc.nextInt();
	    System.out.print("Enter rupees: ");
	    
	    int rs = sc.nextInt();
	    
        int remaining = balancefruits(a, m, rs);
        
        System.out.println(remaining);
    }

    public static int balancefruits(int a, int m, int rs)
    {
        if (a==m)
        {
            return rs;
        } else if (a > m)
        {
           rs =rs-(a-m);
        } else
        {
           rs = rs+(m-a);
        }
        return rs;
    }
}