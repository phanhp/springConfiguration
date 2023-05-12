package pojobeans;

public class AccountServiceImpl implements AccountService {
    private AccountRepository accountRepository;

    public void setAccountRepository (AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    @Override
    public void transferMoney(long fromId, long toId, double amount) {
        Account sourceAccount = accountRepository.find(fromId);
        Account targetAccount = accountRepository.find(toId);
        sourceAccount.setBalance(sourceAccount.getBalance()-amount);
        targetAccount.setBalance(targetAccount.getBalance()+amount);
        accountRepository.update(sourceAccount);
        accountRepository.update(targetAccount);
    }

    @Override
    public void depositMoney(long accountId, double amount) throws Exception {
        Account account = accountRepository.find(accountId);
        account.setBalance(account.getBalance()+amount);
        accountRepository.update(account);
    }

    @Override
    public Account getAccount(long accountId) {
        return accountRepository.find(accountId);
    }


}
