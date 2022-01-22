package PracticeProblems;

import java.util.Scanner;

public class ArmstrongNumber
{
    public void Check()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int number= sc.nextInt();
        int temp, armstrong=0;
        int original = number;

        while (number > 0)
        {
            temp = number%10;
            temp = (int) Math.pow(temp,3);
            armstrong= armstrong+temp;
            number=number/10;
        }
        if(armstrong==original)
        {
            System.out.println("is armstrong");

        }else{
            System.out.println("Not armstrong");
        }
    }
    public static void main(String[] args)
    {
        ArmstrongNumber armstrongNumber= new ArmstrongNumber();
        armstrongNumber.Check();

    }
}
