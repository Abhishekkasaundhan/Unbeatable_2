// Selection Sorting 

public class Selection_Sorting 
{
    public static void main(String[] args)
    {
        int arr[]={4 , 6,3 , 7, 8, 3 ,1};
        for(int i=0 ; i<arr.length-1;i++)
        {
            int smallest = i;
            for(int j=i+1 ; j<arr.length ;j++)
            {
                if(arr[smallest] > arr[j])
                {
                    smallest =j;
                }
            }
             int temp = arr[i];
             arr[i] = arr[smallest];
             arr[smallest]=temp;
        }
        for(int i=0;i<arr.length;i++)
        {
        System.out.print(arr[i] + " ");
        }
    }
}


/*
 Round 1-  1 5 3 9 
 smallest=i=0
 j=i+1=0+1=1
 arr[0]>arr[1] => 1>5 No
 arr[0]>arr[2] => 1>3 No
 arr[0]>arr[3] => 1>9 No


 Round 2- 1 5 3 9
 smallest=i=1
 j=i+1=1+1=2
 arr[1]>arr[2] => 5>3 Yes
  smallest=j => smallest=2
 arr[2]>arr[3] => 3>6 No
 swap
 arr[i] & arr[smallest] => arr[samllest]=3 & arr[i]=5

 Round 3- 1 3 5 9
 smallest=i=2
 j=i+1=2+1=3
 arr[2]>arr[3] => 5>9 No

 */
