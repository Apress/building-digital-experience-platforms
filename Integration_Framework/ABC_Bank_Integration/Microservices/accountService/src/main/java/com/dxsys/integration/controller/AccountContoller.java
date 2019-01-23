package com.dxsys.integration.controller;

import com.dxsys.integration.model.Account;
import com.dxsys.integration.model.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dxsys.integration.services.Accountservice;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class AccountContoller {

    @Autowired
    Accountservice accountservice;


    @RequestMapping("/account/find/{id}")
    public Account findById(@PathVariable Long id) {
        return accountservice.findById(id);
    }
    @RequestMapping("/account/findall")
    public List findAll() {
        return accountservice.findAll();
    }
}
