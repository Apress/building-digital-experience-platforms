package com.dxsys.integration.integratorService.controller;


import com.dxsys.integration.integratorService.model.accountmodel.List;
import com.dxsys.integration.integratorService.proxy.AccountServiceProxy;
import com.dxsys.integration.integratorService.proxy.TransactionServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RefreshScope
@RestController
public class FeignAccountInfoController {


    @Autowired
    AccountServiceProxy proxyAccountService;

    @Autowired
    TransactionServiceProxy proxyTransactionService;

    @RequestMapping("/integrator/feign/account")
    public List findAccount() {
        return proxyAccountService.findAllAccount();
    }

    @RequestMapping("/integrator/feign/transaction")
    public com.dxsys.integration.integratorService.model.transactionmodel.List findTransaction() {
        return proxyTransactionService.findAllAccount();
    }
}
