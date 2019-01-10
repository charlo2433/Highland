package com.example.ray.highlands.Guard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.ray.highlands.R;

public class Activity_Checkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        setTitle("Checkout");

    }
    public void onBackPressed() {
        // Write your code here
        super.onBackPressed();
        moveTaskToBack(true);
    }





}
