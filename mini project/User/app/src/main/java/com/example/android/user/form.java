package com.example.android.user;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.android.user.R;

public class form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
    }
    public void veiwchallan(View v)
    {
        Intent i = new Intent(this,viewchallan.class);
        startActivity(i);


    }
    public void online(View v)
    {
        Toast.makeText(this,"Redirect to Payment Portal",Toast.LENGTH_SHORT).show();

    } public void repo(View v)
    {
        Intent i = new Intent(this,searchno.class);
        startActivity(i);


    }
}
