//Problem Number 18
public class Merge_Sorting 
{

    public static void conquer_the_array(int arr[], int start_index , int mid_index , int end_index)
    {
        int merge_array[]= new int[end_index - start_index +1];   // that is dummy array
        int idx1= start_index;
        int idx2= mid_index+1;
        int x=0;
        while(idx1<=mid_index && idx2<=end_index)
        {
            if(arr[idx1] > arr[idx2])
            {
                merge_array[x++] = arr[idx2++];
            }
            else 
            {
                merge_array[x++] = arr[idx1++];
            }
        }
        while(idx1<=mid_index)
        {       
            merge_array[x++] = arr[idx1++]; 
        }
        while(idx2<=end_index)
        {
            merge_array[x++] = arr[idx2++];
        }

    for(int i=0 , j= start_index ;i < merge_array.length ; i++ , j++) //Copy value from dummy array in main array
    {
        arr[j] = merge_array[i];
    }
    }
    public static void divide_the_array(int arr[] , int start_index, int end_index )
    {
        if(start_index >= end_index)
        {
            return;
        }
        int mid_index = start_index + (end_index -start_index)/2;
         
        divide_the_array(arr ,start_index , mid_index);
        
        divide_the_array(arr, mid_index+1, end_index);
        conquer_the_array(arr , start_index , mid_index , end_index);
    }
    public static void print_the_array(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) 
    {
        int arr[]={6, 3 , 9 , 5, 7 , 2 , 8 , 1 , 22};

        int n= arr.length;

        divide_the_array(arr, 0, n-1);
        print_the_array(arr);
    }
    
}
