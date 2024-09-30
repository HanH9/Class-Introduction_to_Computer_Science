class CheckingAccount extends BankAccount
{
    private final double FEE = 0.15;
    public CheckingAccount(String name,double amount)
    {
        super(name, amount);
        setAccountNumber(getAccountNumber()+"-10");
    }
    @Override
    public boolean withdraw(double amount)
    {
        boolean completed = true;
        double balance=getBalance();
       if(amount+FEE <= balance)
       {
           setBalance(balance-amount-FEE);
       }
       else
       {
           completed = false;
       }
       return completed;
    }
}
