package PracticeProblems;

import java.util.Scanner;

public class PrintingPrimeNumbers {
    public void Print()
    {
        int count =0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter upto how much prime number to print");
        int p= sc.nextInt();

        for (int i= 1;i<=p;i++)
        {
            count=0;
            for (int j=2;j<=i/2;j++)
            {

                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count==0)
            {
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args) {
        PrintingPrimeNumbers numbers= new PrintingPrimeNumbers();
        numbers.Print();

    }
}
