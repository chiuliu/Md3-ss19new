package hibernate_demo.service;

import hibernate_demo.model.Account;

import java.util.List;

public interface IAccountService {

    // Lấy về list để hiển thị

    List<Account> findAll();

    // Tìm kiếm theo id để update lấy ra đối tượng thông qua id

    Account findById(Long id);

    // Thêm mới hoặc update
    void save(Account account);

    // Xoá
    void deleteById(Long id);
}
