package com.example.android.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class VictimInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_victim_info);
    }
    public void noti(View v)
    {
        Toast.makeText(this, "Notification sent", Toast.LENGTH_SHORT).show();
    }
}
