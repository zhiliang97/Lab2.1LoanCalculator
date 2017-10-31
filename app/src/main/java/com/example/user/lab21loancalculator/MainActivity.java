package com.example.user.lab21loancalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String LOAN_STATUS = "status";
    public static final String LOAN_PAYMENT = "payment";
    //TODO : declare global variable here

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO : linking UI to program here
    }

    public void calculateLoan (View view){
        String status = "Approve";
        double monthlyPayment = 450.0;

        //Intent = a object to transfer control
        //from one activity to another
        Intent intent = new Intent(this, ResultActivity.class);

        //putExtra method is used to pass data to another
        //activity. Format putExtra (TAG, Value)
        intent.putExtra(LOAN_STATUS, status);
        intent.putExtra(LOAN_PAYMENT, monthlyPayment);

        //to start a new activity
        startActivity(intent);
    }
}
