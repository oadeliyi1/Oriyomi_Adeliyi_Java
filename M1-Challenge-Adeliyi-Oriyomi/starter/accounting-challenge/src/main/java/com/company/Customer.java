package com.company;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private String name;
    private List<AccountRecord> charges = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void chargesUpdate(int charge, String date){
        AccountRecord chargeInfo = new AccountRecord();
        chargeInfo.setCharge(charge);
        chargeInfo.setChargeDate(date);
        charges.add(chargeInfo);
    }

    public void chargesUpdate(AccountRecord chargeInfo){
        charges.add(chargeInfo);

    }

    public int getBalance() {
        //update this

        int sum = 0;
        for (AccountRecord r:charges) {
            sum+=r.getCharge();
        }



        return sum;
    }

    public List<AccountRecord> getCharges() {

        return charges;
    }

    @Override
    public String toString() {
        //update this
        String idStr = Integer.toString(this.getId());
        String name = this.getName();
        String balance = Integer.toString(this.getBalance());
        return idStr + " "+  name + " " +  balance;
    }
}
