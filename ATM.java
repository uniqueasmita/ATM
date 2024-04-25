import java.util.*;
class bankaccount
{
    private double balance;
    public bankaccount(double initial_balance)
    {
        balance=initial_balance;
    }

    public void deposite(double amount)
    {
        balance+=amount;
        System.out.println("deposit "+amount+"successful");
    }
    public void withdraw(double amount)
    {
        if(balance>=amount)
        {
            balance-=amount;
            System.out.println("withdraw"+amount+"successful");
        }
        else
        {
            System.out.println("insufficient balance.unable to withdraw"+amount+".");
        }
    }
    public double checkbalance()
    {
        return balance;
    }
}

class ATM
{
    public static void main(String[]args)
    {
        bankaccount account=new bankaccount(2000.0);
        Scanner sc=new Scanner(System.in);
        int choice;
        double amount;
        do
        {
            System.out.println("ATM menu:");
            System.out.println("1.withdraw:");
            System.out.println("2.deposit:");
            System.out.println("3.check balance:");
            System.out.println("4.exit:");
            System.out.println("Enter yoyr choice:");

            choice=sc.nextInt();

            switch (choice)
             {
                case 1:
                System.out.println("Enter the amount to withdraw:");
                amount=sc.nextDouble();
                account.withdraw(amount);
                break;
                case 2:
                System.out.println("Enter the amount to deposit:");
                amount=sc.nextDouble();
                account.deposite(amount);
                break;
                case 3:
                System.out.println("current balance:"+account.checkbalance());
                break;
                case 4:
                System.out.println("Thank you using tha ATM. BYE:");
                break;
                default:
                System.out.println("invalid choice. please try again:");
            }
            System.out.println();
        }
        while (choice!=4);
         sc.close();
        
    }
}