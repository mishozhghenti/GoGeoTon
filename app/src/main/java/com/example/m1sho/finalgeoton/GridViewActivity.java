package com.example.m1sho.finalgeoton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GridViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
    }

    public void onClick(View v){
        Intent intent  = new Intent(getApplicationContext(),NewPost.class);
        startActivity(intent);
    }

}
