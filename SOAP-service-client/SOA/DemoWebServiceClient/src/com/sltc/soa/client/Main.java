package com.sltc.soa.client;

import com.sltc.soa.client.stub.DemoWS;
import com.sltc.soa.client.stub.DemoWSService;

import java.util.Scanner;

public class Main
{

    public static void main( String[] args )
    {
        DemoWSService demoWSService = new DemoWSService();
        DemoWS demoWSPort = demoWSService.getDemoWSPort();
        Scanner scan = new Scanner( System.in );

        //adding account holders and the opening balance
        demoWSPort.addHolder("9218001",2500);
        demoWSPort.addHolder("6778443",1500);
        demoWSPort.addHolder("1594256",4000);


        String holderName;
        while (true){
            System.out.print("Enter your Bank account Number: ");
            holderName =scan.nextLine();

            if (demoWSPort.checkUser(holderName)){
                System.out.println("Holder Authenticated");
                break;
            }else {
                System.out.println("Invalid Bank Account. Enter Again.");
            }

        }


        int choice;
        do {
            System.out.println("\n **Welcome to Our Bank Services**");
            System.out.println("\n 1. View Current Balance of the Account \n 2. Deposit to the Bank Account \n 3. Withdraw from the Bank Account \n 4. Transfer to another Account Holder \n 5. Exit ");
            Scanner scan2 = new Scanner( System.in );

            System.out.print("Enter the number of the service needed: ");
            choice = scan2.nextInt();

            switch (choice) {

                case 1:
                    System.out.println( "The current balance of the Bank Account: Rs." + demoWSPort.getBalance(holderName));
                    break;

                case 2:
                    System.out.print("Enter the amount you need to deposit: ");
                    float currentBalance = demoWSPort.deposit(readInputFloat(), holderName);
                    System.out.println("Updated Account Balance: Rs." + currentBalance);
                    break;

                case 3:
                    System.out.print("Enter the amount you need to withdraw: ");
                    currentBalance = demoWSPort.withdraw(readInputFloat(), holderName);
                    if (currentBalance != -1) {
                        System.out.println("Updated Account Balance: Rs." + currentBalance);
                    } else {
                        System.out.println("Balance is insufficient.");
                    }
                    break;

                case 4:
                    System.out.print("Enter the Account Number you need to transfer: ");
                    String otherHolder =scan.nextLine();

                    System.out.print("Enter the amount you want to transfer: ");
                    currentBalance = demoWSPort.transfer(readInputFloat(), holderName, otherHolder);
                    if (currentBalance != -1) {
                        System.out.println("The amount transferred successfully.");
                        System.out.println("Updated Account Balance: Rs." + currentBalance);
                    } else {
                        System.out.println("Balance is insufficient.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using our services.");
                    break;


            }
        }
        while (choice != 5);
    }

    private static float readInputFloat()
    {
        float inputFloat = 0;
        boolean numberFound = false;
        Scanner scan = new Scanner( System.in );
        do
        {

            String inputStr = scan.next();
            try
            {
                inputFloat = Float.parseFloat( inputStr );
                numberFound = true;
            }
            catch( Exception e )
            {
                System.out.print( "Invalid input " + inputStr + ". Please input a valid amount: " );
            }

        } while( !numberFound );
        return inputFloat;
    }
}
