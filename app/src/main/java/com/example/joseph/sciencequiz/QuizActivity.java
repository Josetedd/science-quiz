package com.example.joseph.sciencequiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {
int score=0; // global variable for storing score
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }
    public void calcScore(View view){
        //check quiz answers
        checkQuizes();
        String scoreResurt= "you scored "+ score + "out of 10";
        Toast.makeText(getApplicationContext(),scoreResurt,Toast.LENGTH_LONG).show();
        score = 0;
    }
    private void checkQuizes(){
        RadioButton quiz1Btn = (RadioButton) findViewById(R.id.quiz1_C);
        RadioButton quiz2Btn = (RadioButton) findViewById(R.id.quiz2_C);
        EditText quiz3Text = (EditText) findViewById(R.id.quiz3Ans);
        String quiz3Ans = quiz3Text.getText().toString().trim().toLowerCase();// quiz 3 text
        // quiz 4 Checkboxes with correct answers
        CheckBox quiz4BoxA = (CheckBox) findViewById(R.id.quiz4chkA);
        CheckBox quiz4BoxC = (CheckBox) findViewById(R.id.quiz4chkC);
        CheckBox quiz4BoxD = (CheckBox) findViewById(R.id.quiz4chkD);




        if(quiz1Btn.isChecked()){
            score= score+1;
        }
        if(quiz2Btn.isChecked()){
            score = score+1;

        }
        if (quiz3Ans.equals("uranium")){
            score= score+1;
        }
        if(quiz4BoxA.isChecked() & quiz4BoxC.isChecked() & quiz4BoxD.isChecked()){
            score = score+1;
        }


    }
}
