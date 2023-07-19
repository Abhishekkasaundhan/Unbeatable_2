//Problem Number 20

import java.util.*;
public class Min_penalty 
{
        public static int min_penalty(int n, int[] arr) 
        {
            Arrays.sort(arr); 
            int penalty = 0;
            
            for (int i = 0; i < n-1; i++) 
            {
                penalty += Math.abs(arr[i+1] - arr[i]);
            }
            return penalty;
        }
    
        public static void main(String[] args) 
        {
            int[] arr = {1, 2, 3};
            int penalty = min_penalty(arr.length, arr);
            System.out.println("The penalty is " + penalty); 
    }

}
