package com.krishbarcode.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signin(View v)
    {
        Intent i = new Intent(this,sign_in.class);
        startActivity(i);
    }
    public void profile(View v)
    {
        Toast.makeText(this,"Bad me daluga", Toast.LENGTH_SHORT).show();
//        Intent i = new Intent(this,sign_in.class);
//        startActivity(i);
    }

}
