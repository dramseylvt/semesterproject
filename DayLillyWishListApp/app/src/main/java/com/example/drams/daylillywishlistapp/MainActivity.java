package com.example.drams.daylillywishlistapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void viewCurrentList(View view){
        //go to the view current list
        Intent intent = new Intent(this, viewCurrentList.class);
        startActivity(intent);

    }

    public void createNewList(View view){
        Intent intent = new Intent(this, createNewList.class);
        startActivity(intent);
    }
}
