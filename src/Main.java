public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        BankService bankService = new BankService();

        System.out.println("Initial balance: " + account.getBalance());

        // Deposit $1000
        Transaction depositTransaction = new DepositTransaction();
        bankService.performTransaction(account, depositTransaction, 1000);
        System.out.println("Balance after deposit: " + account.getBalance());

        // Withdraw $500
        Transaction withdrawTransaction = new WithdrawTransaction();
        bankService.performTransaction(account, withdrawTransaction, 500);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        // Try to withdraw more than the balance (expecting InsufficientBalanceException)
        try {
            bankService.performTransaction(account, withdrawTransaction, 1000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
