package PracticeProblems;

import java.util.Scanner;

public class PrimeNumber
{
    public void Check()
    {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int num= sc.nextInt();

        for (int i=2;i<=num;i++)
        {
            if(num%i == 0)
            {
                count++;
            }
        }
        if(count==1)
        {
            System.out.println("is prime");
        }
        else
        {
            System.out.println("is not prime");
        }
    }
    public static void main(String[] args) {
        PrimeNumber number= new PrimeNumber();
        number.Check();

    }
}
