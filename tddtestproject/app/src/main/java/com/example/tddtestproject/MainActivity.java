package com.example.tddtestproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public boolean validateLogin(String PhoneNumber, String password)
    {
        if(PhoneNumber.equals("0592897024") && password.equals("password"))
            return true;
        else
            return false;
    }

    public boolean EmptyPhoneNumper(String PhoneNumber)
    {
        if (PhoneNumber.isEmpty()){
            return true;
        }
        return false;

    }

    public boolean EmptyPassowrd(String password)
    {
        if (password.isEmpty()){
            return true;
        }
        return false;

    }

    public boolean ShortPassword(String password)
    {
        if (password.length()<3){
            return true;
        }
        return false;

    }


}