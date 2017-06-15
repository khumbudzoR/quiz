package com.example.admin.start;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class start extends AppCompatActivity {
ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        imageButton=(ImageButton)findViewById(R.id.imagebutton);
    }
    public void onClick(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
