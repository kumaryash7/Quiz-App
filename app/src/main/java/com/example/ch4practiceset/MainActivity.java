package com.example.ch4practiceset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView question;

   private  String [] questions = {" c++ is a person?", " c++ was introduced in 1823?", " c++ was developed using java?","c++ has interfaces?","c++ has abstract classes?"," C++ was developed in INDIA?"};
   private  boolean[] answers ={false,false,false,true,true,false};
   private int score =0;
   private  int index =0;
    Button yes;

    Button no;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.yes);
        no= findViewById(R.id.no);
        question = findViewById(R.id.question);
        question.setText(questions[index]);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index <= questions.length-1){
                    if(answers[index]==true){
                score++;

                    }
                    index++;
                    if (index<=questions.length-1){
                        question.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your Score Is "+ score, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index <= questions.length-1){
                    if(answers[index]==false){
                        score++;

                    }
                    index++;
                    if (index<=questions.length-1){
                        question.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your Score Is "+ score +"/"+ questions.length, Toast.LENGTH_SHORT).show();


                    }
                }
            }
        });

    }
}