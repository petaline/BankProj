public class BankAccount
{    
    private int accountNumber;
    private double balance;
    private double interestRate;
    private String holderFirstName;
    private String holderLastName;
    private AccountType type;
    
    private static int nextAccountNum = 1001;
    
    public BankAccount()
    {
        accountNumber = getNextAccountNum();
        balance = 0.0;
        interestRate = 0.0;
        holderFirstName = "";
        holderLastName = "";
        type = AccountType.Checking;
    }
    
    public BankAccount(String first, String last, double rate, AccountType at)
    {
        accountNumber = getNextAccountNum();
        balance = 0.0;
        interestRate = rate;
        holderFirstName = first;
        holderLastName = last;
        type = at;
    }
    
    private int getNextAccountNum()
    {
        return nextAccountNum++;
    }
    
    public int getAccountNum()
    {
        return accountNumber;
    }
    
    public double checkBalance()
    {
        return balance;
    }
    
    public void deposit(double amount)
    {
        balance += amount;
    }
    
    public boolean withdraw(double amount)
    {
        boolean success = true;
        if((balance - amount) > 0.0) // Only able to withdraw if there is actually enough money.
        {
            balance -= amount;
        }
        else
        {
            success = false;
        }
        return success;
    }
    
    public double getRate()
    {
        return interestRate;
    }
    
    public void setRate(double rate)
    {
        interestRate = rate;
    }
    
    public void applyInterest()
    {
        balance += (balance * interestRate);
    }
    
    public String getHolderFullName()
    {
        return holderFirstName + " " + holderLastName;
    }
    
    public AccountType getType()
    {
        return type;
    }
}
