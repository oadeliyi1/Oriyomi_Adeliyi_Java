package com.company;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
public class CustomerTest {

    Customer customer;
    @Before
    public void setUp(){
        customer = new Customer();
        customer.setName("Orange Inc");
        customer.setId(4);
        customer.chargesUpdate(5000,"12-03-2020");
        customer.chargesUpdate(-10000,"12-25-2020");
        customer.chargesUpdate(-2000,"01-02-2021");

        // customer
    }

    @Test
    public void getBalanceTest(){
        assertEquals(-7000,customer.getBalance());


    }

    @Test
    public void toStringTest(){
        assertEquals("4 Orange Inc -7000", customer.toString());
    }


}
