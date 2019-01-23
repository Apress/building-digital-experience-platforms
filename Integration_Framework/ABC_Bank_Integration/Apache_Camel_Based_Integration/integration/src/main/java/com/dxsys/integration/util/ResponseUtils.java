package com.dxsys.integration.util;
import org.apache.camel.Exchange;
import org.restlet.data.MediaType;

/**
 * This class creates the response, set in response body and returns response for the service
 *
 * @author Infosys
 * @version 1.0
 * @since 2015-05-09
 */
public class ResponseUtils
{

    /**
     * @param exchange Exchange object
     * @param response Custom response object to be returned
     */
    public void createResponse(Exchange exchange, Object response) throws Exception

    {
        createResponse(exchange, response, 200);
    }

    /**
     * @param exchange     Exchange object
     * @param response     Custom response object to be returned
     * @param responseCode response Code to be returned
     */
    public void createResponse(Exchange exchange, Object response, int responseCode) throws Exception

    {
        exchange.getOut().setHeader("CamelHttpResponseCode", Integer.valueOf(responseCode));
        if (response != null)
        {
            exchange.getOut().setHeader("Content-Type", MediaType.APPLICATION_JSON);
            //exchange.getOut().setHeader("Access-Control-Allow-Origin", "*");
            // exchange.getOut().setHeader("Access-Control-Allow-Origin", "*");
            //exchange.getOut().setHeader("Access-Control-Allow-Headers", "X-Requested-With");
            //exchange.getOut().setHeader("Access-Control-Allow-Headers", "Content-Type");
            //exchange.getOut().setHeader("Access-Control-Allow-Methods", "PUT, GET, POST, DELETE, OPTIONS");

            exchange.getOut().setBody(JsonUtils.convertToJson(response));
        }
    }

    /**
     * @param exchange
     * @param errorCode
     * @param message
     */
    public static void handleError(Exchange exchange, int errorCode, String message) throws Exception

    {
        exchange.getOut().setHeader("CamelHttpResponseCode", Integer.valueOf(errorCode));
        exchange.getOut().setHeader("Content-Type", MediaType.APPLICATION_JSON);
        exchange.getOut().setBody(JsonUtils.convertToJson("Error"));
    }
}