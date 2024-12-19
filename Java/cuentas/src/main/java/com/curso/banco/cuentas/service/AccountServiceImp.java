package com.curso.banco.cuentas.service;

import com.curso.banco.cuentas.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImp implements IAccountService{

    @Autowired
    private IAccountService accountService;


    @Override
    public List<Account> fiandAll() {
        return accountService.fiandAll();
    }

    @Override
    public Account findById(Integer idCuenta) {
        return accountService.findById(idCuenta);
    }

    @Override
    public void saveAccount(Account cuenta) {

        accountService.saveAccount(cuenta);

    }

    @Override
    public void deleteAccount(Account cuenta) {

        accountService.deleteAccount(cuenta);

    }
}
