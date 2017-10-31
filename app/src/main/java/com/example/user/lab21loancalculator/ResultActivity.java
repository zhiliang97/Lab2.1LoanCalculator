package com.example.user.lab21loancalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //Get input data from another activity
        Intent intent = getIntent();
        String status = intent.getStringExtra(MainActivity.LOAN_STATUS);
        double payment = intent.getDoubleExtra(MainActivity.LOAN_PAYMENT, 0);

        //TODO: display outputs here
    }

    public void closeActivity(View view){
        finish();
    }
}
