package com.example.android.user;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class searchno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchno);
    }

    public void search(View v)
    {
        Intent i = new Intent(this,sendaccrepo.class);
        startActivity(i);
    }
}
