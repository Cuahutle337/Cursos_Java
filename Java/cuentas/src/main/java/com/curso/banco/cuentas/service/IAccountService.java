package com.curso.banco.cuentas.service;

import com.curso.banco.cuentas.model.Account;

import java.util.List;

public interface IAccountService {

    public List<Account> fiandAll();

    public Account findById(Integer idCuenta);

    public void saveAccount(Account cuenta);

    public void deleteAccount(Account cuenta);
}
