package com.example.android.user;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.android.user.R;

public class sendaccrepo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sendaccrepo);
    }
    public void noti(View v)
    {
        Toast.makeText(this, "Notification sent", Toast.LENGTH_SHORT).show();
//        Intent i = new Intent(this,sign_in.class);
//        startActivity(i);
    }


}
