package net.javaguides.banking.service;

import java.util.List;

import net.javaguides.banking.dto.AccountDto;
import net.javaguides.banking.entity.Account;

public interface AccountService {
	
	AccountDto createAccount(AccountDto accountDto);
	
	AccountDto getAccountById(long id);
	
	AccountDto deposit(long id, double amount);
	
	AccountDto withdraw(long id, double amount);
	
	List<AccountDto> getAllAccounts();
	
	void deleteAccount(long id);

}
