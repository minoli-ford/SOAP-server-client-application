package com.sltc.soa;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;
import java.util.HashMap;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class DemoWS
{
    //creating a HashMap to store Account Holders and their opening balance/
    HashMap<String,Float> HolderAccounts = new HashMap<String,Float>();

    @WebMethod
    public boolean addHolder(String holderAcc, float balance){
        System.out.println( "Account Created Successfully --> Current Balance " + balance);
        HolderAccounts.put(holderAcc, balance);
        return true;
    }

    @WebMethod
    public boolean checkUser(String holderAcc){
        return HolderAccounts.containsKey(holderAcc);
    }

    @WebMethod
    public float getBalance(String holderAcc){
        float balance = HolderAccounts.get(holderAcc);
        System.out.println( "Current Balance of the Account " + balance);
        return balance;
    }

    @WebMethod
    public float deposit(float amount, String accountNo){
        float balance = HolderAccounts.get(accountNo);
        balance += amount;
        HolderAccounts.put(accountNo, balance);

        System.out.println( "Deposited Successfully --> Current Balance " + balance);

        return balance;
    }

    @WebMethod
    public float withdraw(float amount, String accountNo){
        float balance = HolderAccounts.get(accountNo);
        if(balance >= amount){
            balance -= amount;
            HolderAccounts.put(accountNo, balance);
            System.out.println( "Withdraw Successful --> Current Balance " + balance);
            return balance;
        }else{
            System.out.println("Balance is insufficient.");
            return -1;
        }

    }

    @WebMethod
    public float transfer(float amount, String senderAccountNo, String receiverAccountNo){
        float balance = HolderAccounts.get(senderAccountNo);

        if(balance >= amount){
            balance -= amount;
            HolderAccounts.put(senderAccountNo, balance);
            HolderAccounts.put(receiverAccountNo, HolderAccounts.get(receiverAccountNo)+amount);
            System.out.println( "Transfer Successful --> Current Balance " + balance);
            return balance;
        }else{
            System.out.println("Balance is insufficient.");
            return -1;
        }
    }

    public static void main(String[] args){
        Endpoint.publish("http://localhost:8888/DemoWebService", new DemoWS());
        System.out.println("Server Starts");
    }
}
