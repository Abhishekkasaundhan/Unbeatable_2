import java.util.Scanner;

public class Armstrong_no 
{
     public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the starting point of interval: ");
        int lowerBound = input.nextInt();

        System.out.print("Enter the ending point of  interval: ");
        int upperBound = input.nextInt();

        System.out.println("Armstrong numbers b/w " + lowerBound + " & " + upperBound + ":");
        printArmstrongNo(lowerBound, upperBound);

        input.close();
    }

    public static void printArmstrongNo(int lowerBound, int upperBound) 
    {
        for (int num = lowerBound; num <= upperBound; num++) 
        {
            if (isArmstrongNo(num))
            {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isArmstrongNo(int number) 
    {
        int originalNumber = number;
        int length = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) 
        {
            int digit = number % 10;
            sum += Math.pow(digit, length);
            number /= 10;
        }

        return sum == originalNumber;
    }
}
