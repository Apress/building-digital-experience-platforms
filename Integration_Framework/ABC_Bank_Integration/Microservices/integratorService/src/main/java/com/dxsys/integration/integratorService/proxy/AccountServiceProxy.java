package com.dxsys.integration.integratorService.proxy;


import com.dxsys.integration.integratorService.model.accountmodel.List;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(name = "Account")
@RibbonClient(name = "Account")
public interface AccountServiceProxy {


    @RequestMapping("/account/findall")
    public List findAllAccount();
}
