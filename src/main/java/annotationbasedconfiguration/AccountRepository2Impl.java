package annotationbasedconfiguration;

import org.springframework.stereotype.Repository;
import pojobeans.Account;
import pojobeans.AccountRepository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class AccountRepository2Impl implements AccountRepository {

    private Map<Long, Account> accountsMap = new HashMap<>();
    {
    Account account1 = new Account();
    account1.setId(1);
    account1.setOwnerName("Abc");
    account1.setBalance(2222.22);

    Account account2 = new Account();
    account2.setId(2);
    account2.setOwnerName("Def");
    account2.setBalance(999.99);

    accountsMap.put(account1.getId(),account1);
    accountsMap.put(account2.getId(), account2);
    }

    @Override
    public void insert(Account account) {
        accountsMap.put(account.getId(), account);
    }

    @Override
    public void update(Account account) {
        accountsMap.put(account.getId(), account);
    }

    @Override
    public Account find(long accountId) {
        return accountsMap.get(accountId);
    }
}
