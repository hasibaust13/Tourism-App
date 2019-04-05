package com.example.android.tourismapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Saiful on 1/23/2016.
 */
public class CustomMapActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_map);
    }
    public void showLayout(View view){
        String button_text;

        button_text=((Button) view).getText().toString();

        if (button_text.equals("DHAKA")){
            Intent intent =new Intent(this,DistrictTwoActivity.class);

            startActivity( intent );
        }



    }


}
