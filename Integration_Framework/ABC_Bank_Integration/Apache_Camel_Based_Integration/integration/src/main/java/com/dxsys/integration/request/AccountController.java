package com.dxsys.integration.request;

import com.dxsys.integration.model.AccountModel;
import com.dxsys.integration.util.JsonUtils;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

/**
 * Created by sourabhsethi on 1/Nov/2018.
 */
public class AccountController implements Processor {
    /**
     * This camel controller class implements and fetch accounts.
     * @author sourabh sethi
     * MAC OSX SOURABH MAC
     *
     */

    static Logger log = Logger.getLogger(com.dxsys.integration.response.AccountController.class.getName());
    @Override
    public void process(Exchange exchange) throws Exception {
    System.out.print("Inside Account request Controller ");
        String accountNumber = "12345";

        //exchange.getIn().setBody(JsonUtils.convertToJson(accountNumber));
        AccountModel acc= new AccountModel();
        acc.setAccountNumber(accountNumber);
        log.debug("Json to account."+JsonUtils.convertToJson(acc));
        exchange.getOut().setBody(JsonUtils.convertToJson(acc)); // change the message
        //exchange.getOut().setHeaders(exchange.getIn().getHeaders()); // copy headers from IN to OUT to propagate them

    }

}
