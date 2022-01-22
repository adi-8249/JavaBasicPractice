package PracticeProblems;

import java.util.Scanner;

public class FibonacciSeries {
    public void Print()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter upto how u want to print");
        int number= sc.nextInt();

        int a=0;
        int b=1;
        System.out.print(a+" "+b);
        for (int i=2;i<=number;i++)
        {
            int c = a + b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
        FibonacciSeries series= new FibonacciSeries();
        series.Print();

    }
}
