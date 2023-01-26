package patrones.estructura.facade;

public class BankFacade {

    private Bank bank;

    public BankFacade(Bank bank) {
        this.bank = bank;
    }

    public boolean transfer(long fromAccount, long toAccount, double amount) {
        if (bank != null) {
            bank.verify();
            bank.withdraw();
            bank.deposit();
            return true;
        } else {
            return false;
        }
    }

    public double getBalance(long accountNumber) {
        bank.getBalance();
        return accountNumber ;
    }
}
