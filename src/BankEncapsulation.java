import java.util.*;

public class BankEncapsulation {
    private double balance = 30000;
    private int pin;

    public void deposit(double money) {
        System.out.println(" Enter your pin");
        Scanner s = new Scanner(System.in);
        pin = s.nextInt();
        if (pin == 123) {
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
            balance = balance - money;
            System.out.println(" Deposit Money" + money);
            System.out.println(" Total Balance" + balance);
        } else {
            System.out.println(" Invalid Pin");
        }
    }
}
class Bank_balance
{
  public static void main(String[] args)
  {
      BankEncapsulation be = new BankEncapsulation();
      int i;
      System.out.println("1. Deposit Money");
      System.out.println("2. Withdraw Money");
      System.out.println("Enter your choice");
      Scanner sc= new Scanner(System.in);
      i=sc.nextInt();
      switch(i)
      {
          case 1: be.deposit(4000); break;
          case 2: be.Withdraw(2000); break;
          default: System.out.println("Invalid Choice");
      }

  }
}


