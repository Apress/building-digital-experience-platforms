package com.dxsys.integration.services;


import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.dxsys.integration.model.Account;
import org.springframework.stereotype.Service;
import com.dxsys.integration.model.List;

@Service
public class Accountservice {

    private static Map < Long, Account> AccountRepsitory = null;
    static {
        List list = new List();
        Stream < String > accountStream = Stream.of("10001,200", "10002,200",
                "10003,200");
        AccountRepsitory = accountStream.map(employeeStr -> {
            String[] info = employeeStr.split(",");
            return createTransaction(new Long(info[0]), info[1]);

        }).collect(Collectors.toMap(Account::getAccountNumber, txn -> txn));

    }

    private static Account createTransaction(Long  id, String balanceAmount) {
        Account acc = new Account();
        acc.setAccountNumber(id);
        acc.setBalanceAmount(balanceAmount);

        return acc;
    }

    public Account findById(Long id) {
        return AccountRepsitory.get(id);
    }
    public List findAll() {
        List list = new List();

        list.setList(AccountRepsitory.values());
        return list;
    }

}
