package com.example.drams.daylillywishlistapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class createNewList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_list);
        Intent intent=getIntent();



    }
    public void cancel(View view){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

    }
    public void AddItem(View view){
            Intent intent = new Intent(this, InsertInfoToWishList.class);
            startActivity(intent);
        }

    }

