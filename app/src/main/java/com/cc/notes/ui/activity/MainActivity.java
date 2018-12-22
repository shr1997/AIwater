package com.cc.notes.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.notes.cc.notes.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1=(Button)findViewById(R.id.bbbutton);
        Button button2=(Button)findViewById(R.id.bbbutton1);
        button1.setOnClickListener(new Button1Listener());
        //button2.setOnClickListener(new Button2Listener());
    }
    //define a button listener
    class Button1Listener implements View.OnClickListener{
        @Override
        public void onClick(View view){
            Intent intent=new Intent();
            intent.setClass(MainActivity.this,Control.class);
            startActivity(intent);
        }
    }
}