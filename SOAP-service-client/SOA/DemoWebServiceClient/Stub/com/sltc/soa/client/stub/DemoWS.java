
package com.sltc.soa.client.stub;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DemoWS", targetNamespace = "http://soa.sltc.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DemoWS {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkUser", targetNamespace = "http://soa.sltc.com/", className = "com.sltc.soa.client.stub.CheckUser")
    @ResponseWrapper(localName = "checkUserResponse", targetNamespace = "http://soa.sltc.com/", className = "com.sltc.soa.client.stub.CheckUserResponse")
    @Action(input = "http://soa.sltc.com/DemoWS/checkUserRequest", output = "http://soa.sltc.com/DemoWS/checkUserResponse")
    public boolean checkUser(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "withdraw", targetNamespace = "http://soa.sltc.com/", className = "com.sltc.soa.client.stub.Withdraw")
    @ResponseWrapper(localName = "withdrawResponse", targetNamespace = "http://soa.sltc.com/", className = "com.sltc.soa.client.stub.WithdrawResponse")
    @Action(input = "http://soa.sltc.com/DemoWS/withdrawRequest", output = "http://soa.sltc.com/DemoWS/withdrawResponse")
    public float withdraw(
        @WebParam(name = "arg0", targetNamespace = "")
        float arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addHolder", targetNamespace = "http://soa.sltc.com/", className = "com.sltc.soa.client.stub.AddHolder")
    @ResponseWrapper(localName = "addHolderResponse", targetNamespace = "http://soa.sltc.com/", className = "com.sltc.soa.client.stub.AddHolderResponse")
    @Action(input = "http://soa.sltc.com/DemoWS/addHolderRequest", output = "http://soa.sltc.com/DemoWS/addHolderResponse")
    public boolean addHolder(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        float arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBalance", targetNamespace = "http://soa.sltc.com/", className = "com.sltc.soa.client.stub.GetBalance")
    @ResponseWrapper(localName = "getBalanceResponse", targetNamespace = "http://soa.sltc.com/", className = "com.sltc.soa.client.stub.GetBalanceResponse")
    @Action(input = "http://soa.sltc.com/DemoWS/getBalanceRequest", output = "http://soa.sltc.com/DemoWS/getBalanceResponse")
    public float getBalance(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deposit", targetNamespace = "http://soa.sltc.com/", className = "com.sltc.soa.client.stub.Deposit")
    @ResponseWrapper(localName = "depositResponse", targetNamespace = "http://soa.sltc.com/", className = "com.sltc.soa.client.stub.DepositResponse")
    @Action(input = "http://soa.sltc.com/DemoWS/depositRequest", output = "http://soa.sltc.com/DemoWS/depositResponse")
    public float deposit(
        @WebParam(name = "arg0", targetNamespace = "")
        float arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "transfer", targetNamespace = "http://soa.sltc.com/", className = "com.sltc.soa.client.stub.Transfer")
    @ResponseWrapper(localName = "transferResponse", targetNamespace = "http://soa.sltc.com/", className = "com.sltc.soa.client.stub.TransferResponse")
    @Action(input = "http://soa.sltc.com/DemoWS/transferRequest", output = "http://soa.sltc.com/DemoWS/transferResponse")
    public float transfer(
        @WebParam(name = "arg0", targetNamespace = "")
        float arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

}
