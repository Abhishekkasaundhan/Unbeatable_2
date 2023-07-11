// Program Number 2

import java.util.Scanner;

public class Library 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of books you borrowed : ");

        int books = sc.nextInt();

        System.out.print("Enter the number of due days of the books  : ");

        int due_day = sc.nextInt();

        System.out.print("Enter the number of books for Misplaced : ");

        int M = sc.nextInt();

        System.out.print("Enter the number of books for Hampered : ");

        int H = sc.nextInt();

        float fine =0;

        if(due_day>15 && due_day  <=25)
        {
            fine = (due_day-15)*1.2f;
            due_day=15;
        }
        if(due_day>10 && due_day  <=15)
        {
            fine += (due_day-10)*0.80f;
            due_day=10;
        }
        if(due_day>5 && due_day  <=10)
        {
            fine += (due_day-5)*0.65f;
            due_day=5;
        }
        if(due_day>=1 && due_day  <=5)
        {
               fine += (due_day)*0.4f;
        }

        fine*=books;

        if(M>0)
        {
             fine+=M*500;
        }
        if(H>0)
        {
             fine+=H*200;
        }

        System.out.println("Total Fine : " + fine + "p") ;
    }
}
