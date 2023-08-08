public class BankService {
    public void performTransaction(Account account, Transaction transaction, double amount) {
        transaction.execute(account, amount);
    }
}
