package com.dxsys.integration.transactionService.services;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.dxsys.integration.transactionService.model.List;
import com.dxsys.integration.transactionService.model.Transaction;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    private static Map < Long, Transaction> TransactionRepsitory = null;
    static {
        Stream < String > transactionStream = Stream.of("10001,200,300,800", "10002,200,300,800",
                "10003,200,300,800");
        TransactionRepsitory = transactionStream.map(employeeStr -> {
            String[] info = employeeStr.split(",");
            return createTransaction(new Long(info[0]), info[1], info[2], info[3]);
        }).collect(Collectors.toMap(Transaction::getAccountNumber, emp -> emp));
    }

    private static Transaction createTransaction(Long  id, String balanceAmount,String transactionAmount,String transactionId) {
        Transaction txn = new Transaction();
        txn.setAccountNumber(id);
        txn.setBalanceAmount(balanceAmount);
        txn.setTransactionAmount(transactionAmount);
        txn.setTransactionId(transactionId);

        return txn;
    }

    public Transaction findById(Long id) {
        return TransactionRepsitory.get(id);
    }
    public List findAll() {
        List list = new List();
        list.setList(TransactionRepsitory.values());
        return list;
    }
}
