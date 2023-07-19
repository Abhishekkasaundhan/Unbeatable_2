//Problem Number 15
//Bubble Sorting

public class Bubble_Sorting 
{
    public static void main(String[] args) 
    {
        int arr[]={19 ,36 ,29 ,12, 5};
        
        for(int i=0;i<arr.length-1;i++)            // here i denotes  rounds
        {    int flag=0;
            for(int j=0 ;j<arr.length-i-1;j++)     // here j denotes  swaps
            {
                if(arr[j] > arr[j+1])
                {
                      int temp=arr[j];
                      arr[j]=arr[j+1];
                      arr[j+1]=temp;
                      flag=1;
                }
            }
            if(flag==0)
            {
                break;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
