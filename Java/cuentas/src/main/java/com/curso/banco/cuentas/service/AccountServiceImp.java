package com.curso.banco.cuentas.service;

import com.curso.banco.cuentas.model.Account;
import com.curso.banco.cuentas.repository.IAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImp implements  IAccountService{


    @Autowired
    private IAccountRepository accountRepository;


    @Override
    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public Account findById(Integer idCuenta) {

        return accountRepository.findById(idCuenta).orElse(null);
    }

    @Override
    public void saveAccount(Account cuenta) {

        accountRepository.save(cuenta);

    }

    @Override
    public void deleteAccount(Account cuenta) {

        accountRepository.delete(cuenta);

    }
}
