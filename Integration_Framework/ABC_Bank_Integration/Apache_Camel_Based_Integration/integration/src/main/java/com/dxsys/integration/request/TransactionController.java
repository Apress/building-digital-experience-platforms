package com.dxsys.integration.request;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

/**
 * Created by sourabhsethi on 1/Nov/2018.
 */
public class TransactionController implements Processor {
    /**
     * This camel controller class implements and fetch accounts.
     * @author sourabh sethi
     * MAC OSX SOURABH MAC
     *
     */


    static Logger log = Logger.getLogger(com.dxsys.integration.response.AccountController.class.getName());
    @Override
    public void process(Exchange exchange) throws Exception {
        log.debug("Inside transaction Controller ");

    }

}

