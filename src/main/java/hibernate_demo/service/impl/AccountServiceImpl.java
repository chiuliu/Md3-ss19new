package hibernate_demo.service.impl;

import hibernate_demo.dao.IAccountDao;
import hibernate_demo.model.Account;
import hibernate_demo.service.IAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class AccountServiceImpl implements IAccountService {

    private final IAccountDao accountDao;
    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public Account findById(Long id) {
        return null;
    }

    @Override
    public void save(Account account) {
        accountDao.save(account);
    }

    @Override
    public void deleteById(Long id) {
    }
}
