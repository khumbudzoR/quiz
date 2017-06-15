package com.example.admin.start;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button Religion,Relationship,Music,btnrate;
    public static int score=0;
    RatingBar rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Religion = (Button) findViewById(R.id.Religion);
        Relationship=(Button)findViewById(R.id.btnRelationship);
        Music=(Button)findViewById(R.id.Music);
        btnrate=(Button)findViewById(R.id.btnrate);
        rating= (RatingBar) findViewById(R.id.rating);

    }

    public void onClick1(View view) {
        Intent i = new Intent(this, Religion.class);
        startActivity(i);
    }
    public void onClick4 (View view){
        float ratingvalue = rating.getRating();
        Toast.makeText (this, "Rating is:" + ratingvalue, Toast.LENGTH_SHORT).show();

    }

    public void onClick2(View view) {
        Intent i = new Intent(this, sports.class);
        startActivity(i);
    }
    public void onClick3(View view) {
        Intent i = new Intent(this, television.class);
        startActivity(i);
    }

}
