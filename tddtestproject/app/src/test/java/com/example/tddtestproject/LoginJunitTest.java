package com.example.tddtestproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoginJunitTest {
    MainActivity mainActivity;
    @BeforeClass
    public void BeforeClass(){

    }

    @Before
    public void before(){
        mainActivity=new MainActivity();
    }
    @Test
    public void validateLoginTest(){
        String phonenumber="0592897024";
        String Password="password";
        Assert.assertEquals(mainActivity.validateLogin(phonenumber,Password),true);
    }

    @Test
    public void EmptyPhone(){
        String phonenumber="";
        String Password="password";
        Assert.assertEquals(mainActivity.EmptyPhoneNumper(phonenumber),true);
    }

    @Test
    public void EmptyPassword(){
        String phonenumber="0592897024";
        String Password="";
        Assert.assertEquals(mainActivity.EmptyPassowrd(Password),true);
    }

    @Test
    public void ShortPassword(){
        String Password="123";
        Assert.assertEquals(mainActivity.EmptyPassowrd(Password),true);
    }


    @After
    public void After(){

    }
    @AfterClass
    public void AfterClass(){

    }


}
