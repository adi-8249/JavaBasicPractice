package PracticeProblems;

import java.util.Scanner;

public class FactorialProgram
{
    public void Print()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter upto how much print");
        int number= sc.nextInt();
        int fact=1;
        for(int i=1;i<= number;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args)
    {
        FactorialProgram program= new FactorialProgram();
        program.Print();

    }
}
