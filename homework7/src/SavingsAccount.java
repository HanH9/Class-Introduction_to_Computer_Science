public class SavingsAccount extends BankAccount
{
    private final double rate = 0.025;
    private int savingsNumber = 0;
    private final String accountNumber = getAccountNumber();
    public SavingsAccount(String name,double amount)
    {
        super(name,amount);
        setAccountNumber(accountNumber+"-"+savingsNumber);
    }
    public void postInterest()
    {
        double interest;
        double balance = getBalance();
        interest = balance*rate;
        deposit(interest/12);
    }
    @Override
    public String getAccountNumber()
    {
        return super.getAccountNumber();
    }
    public SavingsAccount(SavingsAccount oldAccount,double amount)
    {
        super(oldAccount,amount);
        setAccountNumber(oldAccount.accountNumber+"-"+(savingsNumber += 1));
    }
}
