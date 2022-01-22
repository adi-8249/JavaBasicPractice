package PracticeProblems;

import java.util.Scanner;

public class ReverseNumber {
    public void Check()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int number= sc.nextInt();
        int rem,rev=0;

        while (number != 0)
        {
            rem = number%10;
            rev=(rev*10) + rem;
            number=number/10;

        }
        System.out.println("reverse is "+rev);
    }
    public static void main(String[] args)
    {
        ReverseNumber number= new ReverseNumber();
        number.Check();
    }
}
