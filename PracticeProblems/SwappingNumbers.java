package JavaBasicPractice.PracticeProblems;

import java.util.Scanner;

public class SwappingNumbers {
    public void Print()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Before swapping the numbers are :"+a+" "+b);

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("After swapping the numbers are :"+a+" "+b);
    }
    public static void main(String[] args) {
        SwappingNumbers swappingNumbers = new SwappingNumbers();
        swappingNumbers.Print();

    }
}
