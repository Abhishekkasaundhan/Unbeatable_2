import java.util.*;

class Income
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the income of the Employee : ");
        int income = sc.nextInt();
        float tax=0;
     

       if(income > 1800000)
       {
          tax=(income-1800000)*0.25f;
          income =1800000;
       }
       if(income > 1400000)
       {
            tax+=(income-1400000)*0.15f;
            income =1400000;
       }
       if(income > 1000000)
       {
            tax +=(income-1000000)*0.10f;
             income =1000000;
       }
       if(income > 700000)
       {
           tax +=(income-700000)*0.05f;
            income =700000;
       }
       if(income > 400000)
       {
           tax +=0;
           income =400000;
       }
        System.out.print("Total Tax : "+ tax);
    }
}