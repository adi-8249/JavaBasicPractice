package JavaBasicPractice.AtmProgram;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AtmOperation
{
    public void Print()
    {
        int balance=1000000, withdraw,deposite;
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Automated Trailer machine");
            System.out.println("Enter the number as per given operation to do");
            System.out.println("1- for withdraw");
            System.out.println("2- deposit");
            System.out.println("3- check balance");
            System.out.println("4- EXit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter how much money to withdraw");
                    withdraw = sc.nextInt();

                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Withdraw is successfully completed");
                        System.out.println("Your Current balance is :" + balance);
                    } else {
                        System.out.println();
                        System.out.println("Insufficient balance");
                        System.out.println();
                    }

                    System.out.println(" ");
                    break;

                case 2:
                    System.out.println("Enter the amount to be deposited");
                    deposite = sc.nextInt();

                    balance = balance + deposite;
                    System.out.println("Money successful deposited");
                    System.out.println();
                    System.out.println("Current balance is :"+balance);
                    break;
                case 3:
                    System.out.println("Check balance");
                    System.out.println("Your balance is :" + balance);
                    System.out.println(" ");
                    break;
                case 4:
                    System.exit(0);

                default:
                    System.out.println();
                    System.out.println("You have entered wrong input");
                    System.out.println();
            }
        }
    }
    public static void main(String[] args)
        {
            AtmOperation operation= new AtmOperation();
            operation.Print();
        }
}
