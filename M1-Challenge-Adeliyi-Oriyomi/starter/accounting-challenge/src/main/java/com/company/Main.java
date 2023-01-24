package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static List<String[]> customerData = Arrays.asList(
            new String[] {"1","Wayne Enterprises","10000","12-01-2021"},
            new String[] {"2","Daily Planet","-7500","01-10-2022"},
            new String[] {"1","Wayne Enterprises","18000","12-22-2021"},
            new String[] {"3","Ace Chemical","-48000","01-10-2022"},
            new String[] {"3","Ace Chemical","-95000","12-15-2021"},
            new String[] {"1","Wayne Enterprises","175000","01-01-2022"},
            new String[] {"1","Wayne Enterprises","-35000","12-09-2021"},
            new String[] {"1","Wayne Enterprises","-64000","01-17-2022"},
            new String[] {"3","Ace Chemical","70000","12-29-2022"},
            new String[] {"2","Daily Planet","56000","12-13-2022"},
            new String[] {"2","Daily Planet","-33000","01-07-2022"},
            new String[] {"1","Wayne Enterprises","10000","12-01-2021"},
            new String[] {"2","Daily Planet","33000","01-17-2022"},
            new String[] {"3","Ace Chemical","140000","01-25-2022"},
            new String[] {"2","Daily Planet","5000","12-12-2022"},
            new String[] {"3","Ace Chemical","-82000","01-03-2022"},
            new String[] {"1","Wayne Enterprises","10000","12-01-2021"}
    );

    public static void main(String[] args) {
        //Update this

        //convert the list that contains string arrays of customer data into a
        // list of customers (where there are no duplicates of customers)

        List<Customer> customerList = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < customerData.size(); i++) {
            String [] customerArr = customerData.get(i);
            int ID = Integer.parseInt(customerArr[0]);
            String name = customerArr[1];
            int charge = Integer.parseInt(customerArr[2]);
            String chargeDate = customerArr[3];
            AccountRecord chargeInfo = new AccountRecord();



            if(names.contains(name)){
                for(Customer c: customerList){
                    if (c.getName().equals(name)){
                        c.chargesUpdate(charge,chargeDate);
//                        chargeInfo.setCharge(charge);
//                        chargeInfo.setChargeDate(chargeDate);
//                        c.chargesUpdate(chargeInfo);

                    }
                }
                 continue;
            }
            Customer current = new Customer();
           //AccountRecord chargeInfo = new AccountRecord();
            chargeInfo.setCharge(charge);
            chargeInfo.setChargeDate(chargeDate);
            names.add(name);
            current.setId(ID);
            current.setName(name);
            customerList.add(current);
            current.chargesUpdate(charge,chargeDate);

        }

        List<Customer> positveAccounts = new ArrayList<>();
        List<Customer> negativeAccounts = new ArrayList<>();

        for (Customer c: customerList) {
            if(c.getBalance() >= 0){
                positveAccounts.add(c);
            } else {
                    negativeAccounts.add(c);
            }
            //System.out.println(c.toString());
        }

       System.out.println("Positive accounts: " + positveAccounts);
        System.out.println("Negative accounts: " + negativeAccounts);
    }
}
