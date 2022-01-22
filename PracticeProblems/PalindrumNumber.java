package PracticeProblems;

import java.util.Scanner;

public class PalindrumNumber {
    public void Check()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int number= sc.nextInt();
        int r, sum=0;
        int temp;
        temp=number;

        while(number > 0)
        {
            r= number % 10;
            sum=(sum*10)+r;
            number=number/10;

        }
        if (temp==sum)
        {
            System.out.println("is palindrum");
        }
        else
        {
            System.out.println("Not palindrum");
        }
    }
    public static void main(String[] args) {
        PalindrumNumber number= new PalindrumNumber();
        number.Check();
    }
}
