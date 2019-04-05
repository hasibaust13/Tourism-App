package com.example.android.tourismapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void showLayout(View view){
        String button_text;

        button_text=((Button) view).getText().toString();

        if (button_text.equals("Click Anywhere to continue..")){
            Intent intent =new Intent(this,DistrictTwoActivity.class);

            startActivity( intent );
        }


    }
}