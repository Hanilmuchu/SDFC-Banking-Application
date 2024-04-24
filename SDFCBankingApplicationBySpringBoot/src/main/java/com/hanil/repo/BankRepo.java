package com.hanil.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hanil.entity.Bank;
@Repository
public interface BankRepo extends CrudRepository<Bank, Integer> {

}
