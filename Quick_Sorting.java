//Problem Number 19
public class Quick_Sorting
 {

    public static int partition(int arr [], int low , int high)
    {
        int pivot=arr[high];
        int i=low-1;
        for(int j=low ;j<high;j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[high];                   // arr[high] that is pivot
        arr[high]=temp;
        return i;
    }
    public static void quicksort(int arr[] , int low , int high)
    {
        if(low < high)
        {
           int pivot_index = partition(arr, low , high);
        
           quicksort(arr, low, pivot_index-1);
           quicksort(arr, pivot_index+1, high);
        }
    }
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) 
    {
         int arr[]={3 , 6, 4, 7 , 9};
          int n = arr.length;
         quicksort(arr , 0 , n-1);
         printArray(arr);
    }
}
