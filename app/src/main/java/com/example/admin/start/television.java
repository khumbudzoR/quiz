package com.example.admin.start;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class television extends AppCompatActivity {
    public int score = 0;
    RadioButton radioButton1, radio1p, radio2p, radio3p, radio4p, radio5p, radio6p, radio7p, radio8p, radio9p, radio10p, radio11p, radio12p, radio13p, radio14p, radio15p, radio16p, radio17p, radio18p, radio19p, radio20p;
    RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_television);


        radio1p = (RadioButton) findViewById(R.id.radio1p);
        radio2p = (RadioButton) findViewById(R.id.radio2p);
        radio3p = (RadioButton) findViewById(R.id.radio3p);
        radio4p = (RadioButton) findViewById(R.id.radio4p);
        radio5p = (RadioButton) findViewById(R.id.radio5p);
        radio6p = (RadioButton) findViewById(R.id.radio6p);
        radio7p = (RadioButton) findViewById(R.id.radio7p);
        radio8p = (RadioButton) findViewById(R.id.radio8p);
        radio9p = (RadioButton) findViewById(R.id.radio9p);
        radio10p = (RadioButton) findViewById(R.id.radio10p);
        radio11p = (RadioButton) findViewById(R.id.radio11p);
        radio12p = (RadioButton) findViewById(R.id.radio12p);
        radio13p = (RadioButton) findViewById(R.id.radio13p);
        radio14p = (RadioButton) findViewById(R.id.radio14p);
        radio15p = (RadioButton) findViewById(R.id.radio15p);
        radio16p = (RadioButton) findViewById(R.id.radio16p);
        radio17p = (RadioButton) findViewById(R.id.radio17p);
        radio18p = (RadioButton) findViewById(R.id.radio18p);
        radio19p = (RadioButton) findViewById(R.id.radio19p);
        radio20p = (RadioButton) findViewById(R.id.radio20p);


    }

    //Question 1
    public void ReligionQ1(View view) {
        radioGroup = (RadioGroup) findViewById(R.id.radioG1p);

        int radioButton = radioGroup.getCheckedRadioButtonId();

        radioButton1 = (RadioButton) findViewById(radioButton);

        String answer = radioButton1.getText().toString();

        if (answer.equals("22")) {
            score = score + 1;

        }



    }


    //Question 2
    public void ReligionQ2(View view) {
        radioGroup = (RadioGroup) findViewById(R.id.radioG2p);

        int radioButton = radioGroup.getCheckedRadioButtonId();

        radioButton1 = (RadioButton) findViewById(radioButton);

        String answer = radioButton1.getText().toString();

        if (answer.equals("Family Fortunes")) {
            score = score + 1;

        }
    }

    //Question 3
    public void ReligionQ3(View view) {
        radioGroup = (RadioGroup) findViewById(R.id.radioG3p);

        int radioButton = radioGroup.getCheckedRadioButtonId();

        radioButton1 = (RadioButton) findViewById(radioButton);

        String answer = radioButton1.getText().toString();

        if (answer.equals("Jack Dee")) {
            score = score + 1;

        }

    }


    //Question 4
    public void ReligionQ4(View view) {
        radioGroup = (RadioGroup) findViewById(R.id.radioG4p);

        int radioButton = radioGroup.getCheckedRadioButtonId();

        radioButton1 = (RadioButton) findViewById(radioButton);

        String answer = radioButton1.getText().toString();

        if (answer.equals("The Ordinary Boys")) {
            score = score + 1;

        }
    }
    //Question 5
    public void ReligionQ5(View view) {
        radioGroup = (RadioGroup) findViewById(R.id.radioG5p);

        int radioButton = radioGroup.getCheckedRadioButtonId();

        radioButton1 = (RadioButton) findViewById(radioButton);

        String answer = radioButton1.getText().toString();

        if (answer.equals("The Simpsons")) {
            score = score + 1;


        }

    }

    public int CalculatePer(int finalScore) {

        double per = (((double) (finalScore) / 5.0) * 100);

        return (int) per;
    }

    public void submitButtonp(View view) {


        boolean first = false,second = false ,third = false,fourth = false,five = false;

        if (radio17p.isChecked()  ||radio18p.isChecked() || radio19p.isChecked() || radio20p.isChecked()) {
            first =true;
        } else {
            Toast.makeText(this, "You didn't answer question 5", Toast.LENGTH_SHORT).show();
        }

        if (radio13p.isChecked() || radio14p.isChecked() ||radio15p.isChecked() || radio16p.isChecked()) {
            second =true;
        } else {
            Toast.makeText(this, "You didn't answer question 4", Toast.LENGTH_SHORT).show();
        }

        if (radio9p.isChecked() || radio10p.isChecked() || radio11p.isChecked() || radio12p.isChecked()) {
            third = true;
        } else {
            Toast.makeText(this, "You didn't answer question 3", Toast.LENGTH_SHORT).show();
        }

        if (radio5p.isChecked() || radio6p.isChecked() || radio7p.isChecked() || radio8p.isChecked()) {
            fourth=true;
        } else {
            Toast.makeText(this, "You didn't answer question 2", Toast.LENGTH_SHORT).show();


        }
        if (radio1p.isChecked() || radio2p.isChecked() || radio3p.isChecked() || radio4p.isChecked()) {
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
