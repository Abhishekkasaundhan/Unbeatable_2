// Insertion Sorting

public class Insertion_Sorting
{
    public static void main(String[] args)
    {
        int arr[] ={5 , 1 , 6 , 2 , 4 , 3};
        for(int i=1 ;i<arr.length;i++)     //Unsorted part
        {
            int current =arr[i];
            int j=i-1;
            while(j>=0 && arr[j] > current )     // Shifting the position
            {
                arr[j+1]=arr[j];
                j--;
            }
            j=j+1; 
            arr[j]=current;
           
          
        }
        for(int k=0;k<arr.length;k++)
           {
            System.out.print(arr[k] + " ");
           }
    }
}

