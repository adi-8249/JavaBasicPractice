package JavaBasicPractice.PracticeProblems;

import java.util.Scanner;

public class AtmProgram
{
    public static void main(String[] args)
    {

        int balance=10000000;
        int deposit,withdraw;

        System.out.println("Automated trailer machine");
        System.out.println("choose the operation");
        System.out.println("1- withdraw");
        System.out.println("2-check balance");
        System.out.println("3-Exit");

        while(true)
        {
        Scanner sc = new Scanner(System.in);
            int choice= sc.nextInt();

            switch (choice)
            {
                case 1:

                    System.out.println("Enter amount");
                    withdraw = sc.nextInt();


                    if (balance >= withdraw)
                    {
                        balance = balance - withdraw;
                        System.out.println("Current balance =" + balance);


                        System.out.println("Do you want to deposit money");
                        System.out.println("1-deposit");
                        System.out.println("2-Exit operation");
                        Scanner sca = new Scanner(System.in);
                        choice=sca.nextInt();

                        switch (choice)
                        {
                            case 1:

                                System.out.println("Enter the amount to deposit");
                                deposit=sc.nextInt();
                                balance = balance + deposit;

                                if (balance > 10000000) {
                                    balance = balance - (balance * 3 / 100);
                                    System.out.println("Your current balance=" + balance +" After deducting 3% tax");
                                }
                                break;
                            case 2:
                                System.exit(1);
                                break;
                        }
                    }
                case 3:
                    System.exit(1);
            }
        }
    }
}
