package com.example.admin.start;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static android.os.Build.VERSION_CODES.M;

public class sports extends AppCompatActivity {

    public int score = 0;
    RadioButton radioButton1, radio1r, radio2r, radio3r, radio4r, radio5r, radio6r, radio7r, radio8r, radio9r, radio10r, radio11r, radio12r, radio13r, radio14r, radio15r, radio16r, radio17r, radio18r, radio19r, radio20r;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

        radio1r = (RadioButton) findViewById(R.id.radio1r);
        radio2r = (RadioButton) findViewById(R.id.radio2r);
        radio3r = (RadioButton) findViewById(R.id.radio3r);
        radio4r = (RadioButton) findViewById(R.id.radio4r);
        radio5r = (RadioButton) findViewById(R.id.radio5r);
        radio6r = (RadioButton) findViewById(R.id.radio6r);
        radio7r= (RadioButton) findViewById(R.id.radio7r);
        radio8r = (RadioButton) findViewById(R.id.radio8r);
        radio9r = (RadioButton) findViewById(R.id.radio9r);
        radio10r = (RadioButton) findViewById(R.id.radio10r);
        radio11r = (RadioButton) findViewById(R.id.radio11r);
        radio12r = (RadioButton) findViewById(R.id.radio12r);
        radio13r = (RadioButton) findViewById(R.id.radio13r);
        radio14r = (RadioButton) findViewById(R.id.radio14r);
        radio15r = (RadioButton) findViewById(R.id.radio15r);
        radio16r = (RadioButton) findViewById(R.id.radio16r);
        radio17r = (RadioButton) findViewById(R.id.radio17r);
        radio18r = (RadioButton) findViewById(R.id.radio18r);
        radio19r = (RadioButton) findViewById(R.id.radio19r);
        radio20r = (RadioButton) findViewById(R.id.radio20r);

    }

    //Question 1
    public void ReligionQ1(View view) {
        radioGroup = (RadioGroup) findViewById(R.id.radioGroupr);

        int radioButton = radioGroup.getCheckedRadioButtonId();

        radioButton1 = (RadioButton) findViewById(radioButton);

        String answer = radioButton1.getText().toString();

        if (answer.equals("Johannesburg")) {
            score = score + 1;

        }

    }


    //Question 2
    public void ReligionQ2(View view) {
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup2);

        int radioButton = radioGroup.getCheckedRadioButtonId();

        radioButton1 = (RadioButton) findViewById(radioButton);

        String answer = radioButton1.getText().toString();

        if (answer.equals("Celtic")) {
            score = score + 1;

        }
    }

    //Question 3
    public void ReligionQ3(View view) {
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup3);

        int radioButton = radioGroup.getCheckedRadioButtonId();

        radioButton1 = (RadioButton) findViewById(radioButton);

        String answer = radioButton1.getText().toString();

        if (answer.equals("Prague")) {
            score = score + 1;

        }

    }


    //Question 4
    public void ReligionQ4(View view) {
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup4);

        int radioButton = radioGroup.getCheckedRadioButtonId();

        radioButton1 = (RadioButton) findViewById(radioButton);

        String answer = radioButton1.getText().toString();

        if (answer.equals("Volkswagen")) {
            score = score + 1;

        }
    }
    //Question 5
    public void ReligionQ5(View view) {
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup5);

        int radioButton = radioGroup.getCheckedRadioButtonId();

        radioButton1 = (RadioButton) findViewById(radioButton);

        String answer = radioButton1.getText().toString();

        if (answer.equals("England")) {
            score = score + 1;

        }
    }
    public void exit(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        alertDialogBuilder.setTitle("score..!!!");

        alertDialogBuilder.setMessage(CalculatePer(score)+"%");

        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("Quit", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                finish();
            }
        });

        alertDialogBuilder.setNegativeButton("Continue", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(sports.this,"You clicked over Continue",Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }



    public int CalculatePer(int finalScore) {

        double per = (((double) (finalScore) / 5.0) * 100);

        return (int) per;
    }



    public void submitButtonr(View view) {


        boolean first = false,second = false ,third = false,fourth = false,five = false;

        if (radio17r.isChecked()  || radio18r.isChecked() || radio19r.isChecked() || radio20r.isChecked()) {
            first =true;
        } else {
            Toast.makeText(this, "You didn't answer question 5", Toast.LENGTH_SHORT).show();
        }

        if (radio13r.isChecked() || radio14r.isChecked() || radio15r.isChecked() || radio16r.isChecked()) {
            second =true;
        } else {
            Toast.makeText(this, "You didn't answer question 4", Toast.LENGTH_SHORT).show();
        }

        if (radio9r.isChecked() || radio10r.isChecked() || radio11r.isChecked() || radio12r.isChecked()) {
            third = true;
        } else {
            Toast.makeText(this, "You didn't answer question 3", Toast.LENGTH_SHORT).show();
        }

        if (radio5r.isChecked() || radio6r.isChecked() || radio7r.isChecked() || radio8r.isChecked()) {
            fourth=true;
        } else {
            Toast.makeText(this, "You didn't answer question 2", Toast.LENGTH_SHORT).show();


        }
        if (radio1r.isChecked() || radio2r.isChecked() || radio3r.isChecked() || radio4r.isChecked()) {
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