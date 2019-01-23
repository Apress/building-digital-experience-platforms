package com.dxsys.integration.transactionService;

import com.dxsys.integration.transactionService.model.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.dxsys.integration.transactionService.services.TransactionService;
import com.dxsys.integration.transactionService.model.Transaction;

import java.util.Collection;


@RestController
public class TransactionController {

    @Autowired
    TransactionService transactionService;


    @RequestMapping("/transaction/find/{id}")
    public Transaction findById(@PathVariable Long id) {
        return transactionService.findById(id);
    }
    @RequestMapping("/transaction/findall")
    public List findAll() {
        return transactionService.findAll();
    }

}
