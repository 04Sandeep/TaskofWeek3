import java.util.*;

public abstract class BankAbstraction
{
    abstract void depositmoney();
    abstract void withdrawmoney();
    String IFSC = "112233"; String name = "SBI"; double balance = 10000;
    public void Bankinfo()
    {
      System.out.println("Name of Bank is" + " " +name);
      System.out.println("IFSC code of Bank is" + " " +IFSC);
    }
}
 class Deposit1 extends BankAbstraction {
    private int pin;
     double money;
    Scanner bb = new Scanner(System.in);
    public void depositmoney()
        {
        System.out.println(" Enter your pin");
        Scanner s = new Scanner(System.in);
        pin = s.nextInt();
        if (pin == 123) {
            System.out.println(" Enter deposit money");
            money = bb.nextDouble();
            balance = balance + money;
            System.out.println(" Deposit Money" + money);
            System.out.println(" Total Balance" + balance);

        } else {
            System.out.println(" Invalid Pin");
        }
    }

    public void withdrawmoney() {
        System.out.println(" Enter your pin");
        Scanner s = new Scanner(System.in);
        pin = s.nextInt();
        if (pin == 123) {
            System.out.println(" Enter withdraw money");
            money =bb.nextDouble();
            if(balance>=money) {
                balance = balance - money;
                System.out.println("Withdraw Money" + money);
                System.out.println(" Total Balance" + balance);
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
class Bank1
{
    public static void main(String[] args)
    {
        BankAbstraction ba = new Deposit1();
        ba.Bankinfo();
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("Enter your choice");
        Scanner sc= new Scanner(System.in);
        int i=sc.nextInt();
        switch(i)
        {
            case 1: ba.depositmoney();break;
            case 2: ba.withdrawmoney();break;
            default: System.out.println("Invalid Choice");
        }
    }
}
