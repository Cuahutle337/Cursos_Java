package com.curso.banco.cuentas.repository;

import com.curso.banco.cuentas.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAccountRepository extends JpaRepository<Account,Integer> {
}
