package com.example.admin.start;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.example.admin.start.R.id.radio1;
import static com.example.admin.start.R.id.radio2;
import static com.example.admin.start.R.id.radio3;
import static com.example.admin.start.R.id.radio4;


public class Religion extends AppCompatActivity {


    public int score = 0;
    RadioButton radioButton1, radio1, radio2, radio3, radio4, radio5, radio6, radio7, radio8, radio9, radio10, radio11, radio12, radio13, radio14, radio15, radio16, radio17, radio18, radio19, radio20;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religion);

        radio1 = (RadioButton) findViewById(R.id.radio1);
        radio2 = (RadioButton) findViewById(R.id.radio2);
        radio3 = (RadioButton) findViewById(R.id.radio3);
        radio4 = (RadioButton) findViewById(R.id.radio4);
        radio5 = (RadioButton) findViewById(R.id.radio5);
        radio6 = (RadioButton) findViewById(R.id.radio6);
        radio7 = (RadioButton) findViewById(R.id.radio7);
        radio8 = (RadioButton) findViewById(R.id.radio8);
        radio9 = (RadioButton) findViewById(R.id.radio9);
        radio10 = (RadioButton) findViewById(R.id.radio10);
        radio11 = (RadioButton) findViewById(R.id.radio11);
        radio12 = (RadioButton) findViewById(R.id.radio12);
        radio13 = (RadioButton) findViewById(R.id.radio13);
        radio14 = (RadioButton) findViewById(R.id.radio14);
        radio15 = (RadioButton) findViewById(R.id.radio15);
        radio16 = (RadioButton) findViewById(R.id.radio16);
        radio17 = (RadioButton) findViewById(R.id.radiio17);
        radio18 = (RadioButton) findViewById(R.id.radio18);
        radio19 = (RadioButton) findViewById(R.id.radio19);
        radio20 = (RadioButton) findViewById(R.id.radio20);

    }

    //Question 1
    public void ReligionQ1(View view) {
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        int radioButton = radioGroup.getCheckedRadioButtonId();

        radioButton1 = (RadioButton) findViewById(radioButton);

        String answer = radioButton1.getText().toString();

        if (answer.equals("Delilah")) {
            score = score + 1;


        }

    }


    //Question 2
    public void ReligionQ2(View view) {
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup2);

        int radioButton = radioGroup.getCheckedRadioButtonId();

        radioButton1 = (RadioButton) findViewById(radioButton);

        String answer = radioButton1.getText().toString();

        if (answer.equals("Revelation")) {
            score = score + 1;

        }
    }

    //Question 3
    public void ReligionQ3(View view) {
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup3);

        int radioButton = radioGroup.getCheckedRadioButtonId();

        radioButton1 = (RadioButton) findViewById(radioButton);

        String answer = radioButton1.getText().toString();

        if (answer.equals("Noah")) {
            score = score + 1;

        }

    }


    //Question 4
    public void ReligionQ4(View view) {
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup4);

        int radioButton = radioGroup.getCheckedRadioButtonId();

        radioButton1 = (RadioButton) findViewById(radioButton);

        String answer = radioButton1.getText().toString();

        if (answer.equals("Fire and Brimstone")) {
            score = score + 1;

        }


    }

    //Question 5
    public void ReligionQ5(View view) {
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup5);

        int radioButton = radioGroup.getCheckedRadioButtonId();

        radioButton1 = (RadioButton) findViewById(radioButton);

        String answer = radioButton1.getText().toString();

        if (answer.equals("Amos")) {
            score = score + 1;

        }

    }

    public int CalculatePer(int finalScore) {

        double per = (((double) (finalScore) / 5.0) * 100);

        return (int) per;
    }

    public void submitButton(View view) {


     boolean first = false,second = false ,third = false,fourth = false,five = false;

        if (radio17.isChecked()  || radio18.isChecked() || radio19.isChecked() || radio20.isChecked()) {
            first =true;
        } else {
            Toast.makeText(this, "You didn't answer question 5", Toast.LENGTH_SHORT).show();
        }

        if (radio13.isChecked() || radio14.isChecked() || radio15.isChecked() || radio16.isChecked()) {
            second =true;
        } else {
            Toast.makeText(this, "You didn't answer question 4", Toast.LENGTH_SHORT).show();
        }

        if (radio9.isChecked() || radio10.isChecked() || radio11.isChecked() || radio12.isChecked()) {
            third = true;
        } else {
            Toast.makeText(this, "You didn't answer question 3", Toast.LENGTH_SHORT).show();
        }

        if (radio5.isChecked() || radio6.isChecked() || radio7.isChecked() || radio8.isChecked()) {
            fourth=true;
        } else {
            Toast.makeText(this, "You didn't answer question 2", Toast.LENGTH_SHORT).show();


        }
        if (radio1.isChecked() || radio2.isChecked() || radio3.isChecked() || radio4.isChecked()) {
            five = true;
        } else {
            Toast.makeText(this, "You didn't answer question 1", Toast.LENGTH_SHORT).show();

        }


        if ( first == true && second == true   && third == true && fourth == true && five ==true) {

            Toast.makeText(this, String.valueOf(CalculatePer(score) + "%"), Toast.LENGTH_SHORT).show();


            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

            alertDialogBuilder.setTitle("score..!!!");

            alertDialogBuilder.setMessage(CalculatePer(score) + "%");


            alertDialogBuilder.setPositiveButton("ok", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface arg0, int arg1) {
                    finish();
                }
            });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }

        }
    }
