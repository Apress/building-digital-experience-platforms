package com.dxsys.integration.response;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

public class AccountController implements Processor {
    /**
     * This camel controller class implements and fetch accounts.
     * @author sourabh sethi
     * MAC OSX SOURABH MAC
     *
     */

    static Logger log = Logger.getLogger(AccountController.class.getName());
    @Override
    public void process(Exchange exchange) throws Exception {
        log.debug("Inside Account Controller ");
        log.info("Enter the method process() of class " + AccountController.class.getName());
        Message in = exchange.getIn();
        String msg = in.getBody(String.class);
        log.info("msg controller " +msg);
        exchange.getOut().setBody(msg);
        //new ResponseUtils().createResponse(exchange, msg, 200); // Use this method is you want to convert PoJo model into JSON.
    }

}

