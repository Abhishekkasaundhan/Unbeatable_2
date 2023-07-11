// Program Number 9

public class Product_of_L_and_S{
    public static void main(String[] args) {
        int[] n = {8, 3, 5, 2, 4, 7, 9, 1};
        int[] m = new int[n.length];
        
    for(int i=0;i<n.length;i++)
    {
        int l=0 , s=0;
        for(int j=i+1;j<n.length;j++)
        {
            if(( n[i] > n[j]))
                s+=n[j];
            else if(( n[i] < n[j]))
                l+=n[j];
            else
                continue;
        }
           m[i]=l*s;
    }
    for (int i = 0; i < m.length; i++) 
    {
        System.out.print(m[i] + " ");
    }
    }
}