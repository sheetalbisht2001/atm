package org.example;


import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner ;

public class OptionMenu extends Account {
    Scanner menuInput = new Scanner(System.in) ;
    DecimalFormat moneyFormat = new DecimalFormat(" '$'###,##0.00") ;

    HashMap<Integer, Integer> data = new HashMap<Integer,  Integer>() ;
    public void getLogin() throws IOException {
        int x=1 ;
        do{
            try{
                data.put(952141, 191904) ;
                data.put(989947, 71976) ;

                System.out.println("Welcome to the ATM Project");
                System.out.println("Enter your customer Number");
                setCustomerNumber(menuInput.nextInt()) ;

                System.out.println("Enter your PIN Number");
                setPinNumber(menuInput.nextInt()) ;
            }
            catch(Exception e){
                System.out.println("""

                        Invalid Character(s). Only Numbers.
                        """);
                x=2 ;
            }

            /*
            * for(Map.Entry<Integer,Integer>it : data.entrySet()){
            * if(it.getKey()==getCustomerNUmber() && it.getValue()==getPinNumber){
            * getAccountTYpe() ; }}
             */

            int cn = getCustomerNumber() ;
            int pn = getPinNumber() ;
            if(data.containsKey(cn) && data.get(cn) == pn){
                getAccountType() ;
            }
            else
                System.out.println("""

                        Wrong Customer NUmber or Pin Number
                        """);
        }
        while(x==1) ;
            }

            public void getAccountType(){
                System.out.println("Select the Account you want to Access: ");
                System.out.println(" TYpe 1 - Checking Account");
                System.out.println("TYpe 2 - Saving Account");
                System.out.println("Type 3 - Exit") ;

                int selection = menuInput.nextInt();

                switch (selection) {
                    case 1 -> {
                        getChecking();
                        break ;
                    }
                    case 2 -> {
                        getSaving();
                        break ;
                    }

                    case 3 -> {
                        System.out.println("Thank You for using ATM, bye. \n");
                        break ;
                    }

                    default -> {
                        System.out.println(""" 

                                Invalid Choice.
                                """);
                        getAccountType();
                    }
                }

            }

            public double getChecking(){
                System.out.println("Checking Account: ");
                System.out.println("Type 1 - View Balance");
                System.out.println("Type 2 - Withdraw Funds");
                System.out.println("TYpe 3 - Deposit Funds");
                System.out.println("TYpe 4 - Exit");
                System.out.print("Choice:");

                int selection = menuInput.nextInt() ;

                switch (selection) {
                    case 1 -> {
                        System.out.println("Checking Account Balance: " + moneyFormat.format(getChecking()));
                        getAccountType();
                    }
                    case 2 -> {
                        getCheckingWithdrawInput();
                        getAccountType();
                    }
                    case 3 -> {
                        getCheckingDepositInput();
                        getAccountType();
                    }
                    case 4 -> System.out.println("Thank You for using this ATM, bye.");
                    default -> {
                        System.out.println("""

                                Invalid Choice.
                                """);
                        getChecking();
                    }
                }

                return 0;
            }

            public double getSaving(){
                System.out.println("Checking Account: ");
                System.out.println("Type 1 - View Balance");
                System.out.println("Type 2 - Withdraw Funds");
                System.out.println("TYpe 3 - Deposit Funds");
                System.out.println("TYpe 4 - Exit");
                System.out.print("Choice:");

                int selection = menuInput.nextInt();

                switch (selection) {
                    case 1 -> {
                        System.out.println("Saving Account Balance: " + moneyFormat.format(getSaving()));
                        getAccountType();
                    }
                    case 2 -> {
                        getsavingWithdrawInput();
                        getAccountType();
                    }
                    case 3 -> {
                        getSavingDepositInput();
                        getAccountType();
                    }
                    case 4 -> System.out.println("Thank You for using this ATM, bye.");
                    default -> {
                        System.out.println("""

                                Invalid Choice.
                                """);
                        getChecking();
                    }
                }


                return 0 ;
            }



}
