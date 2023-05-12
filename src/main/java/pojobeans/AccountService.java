package pojobeans;

public interface AccountService {
    void transferMoney(long fromId, long toId, double amount);
    void depositMoney(long accountId, double amount) throws Exception;
    Account getAccount(long accountId);
}
