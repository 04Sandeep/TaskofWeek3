import java.util.Scanner;

public class Inputbalance {
    private double balance = 10000;
    private int pin;
    Scanner bb = new Scanner(System.in);
    public void deposit(double money) {
        System.out.println(" Enter your pin");
        Scanner s = new Scanner(System.in);
        pin = s.nextInt();
        if (pin == 123) {
            System.out.println(" Enter Deposit Money");

            money = bb.nextDouble();
            balance = balance + money;
            System.out.println(" Deposit Money" + money);
            System.out.println(" Total Balance" + balance);
        }
        else
        {
            System.out.println(" Invalid Pin");
        }
    }
    public void Withdraw(double money) {
        System.out.println(" Enter your pin");
        Scanner s = new Scanner(System.in);
        pin = s.nextInt();
        if (pin == 123) {
            System.out.println(" Withdraw money");
            money =bb.nextDouble();
            if(balance>=money) {
                balance = balance - money;
                System.out.println("Withdraw Money" + " " + money);
                System.out.println(" Total Balance" + " " + balance);
            }
            else
            {
                System.out.println("The amount in your account is less than withdrawn money");
            }
        }
        else {
            System.out.println(" Invalid Pin");
        }
    }
}
class Bank
{
    public static void main(String[] args)
    {
        Inputbalance ib = new Inputbalance();
        int i;
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("Enter your choice");
        Scanner sc= new Scanner(System.in);
        i=sc.nextInt();
        switch(i)
        {
            case 1: ib.deposit(i);
            break;
            case 2: ib.Withdraw(i);
            break;
            default: System.out.println("Invalid Choice");
        }
    }
}




