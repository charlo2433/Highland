package com.example.ray.highlands.Guard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;

import com.example.ray.highlands.R;

public class Activity_Checkin extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkin);
        setTitle("Checkin");

        findViewById(R.id.vehicle).setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
}

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.vehicle:
                startActivity(new Intent(getApplicationContext(), Activity_Categories.class));
                break;
        }

    }
}
