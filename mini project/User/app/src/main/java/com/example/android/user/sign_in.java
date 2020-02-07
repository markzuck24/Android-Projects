package com.example.android.user;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.android.user.R;

public class sign_in extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }
    public void Singnup1(View v)
    {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void Singnup(View v)
    {
        Intent i1 = new Intent(this, form.class);
        startActivity(i1);
    }
}
