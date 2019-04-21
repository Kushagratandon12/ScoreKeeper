package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {
    int scorea = 0;
    int scoreb = 0;
    int foula = 0;
    int foulb = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForScoreA(scorea);
        displayForScoreB(scoreb);

    }

    public void Scorea(View view) {
        scorea++;
        displayForScoreA(scorea);

    }

    public void Foula(View view) {
        foula++;
        displayForFoulA(foula);
    }


    public void resetscore(View view) {
        scorea = 0;
        scoreb = 0;
        foula = 0;
        foulb = 0;
        displayForScoreA(scorea);
        displayForScoreB(scoreb);
        displayForFoulA(foula);
        displayForFoulB(foulb);


    }

    public void displayForScoreA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForFoulA(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_a_foul);
        foulView.setText(String.valueOf(foul));
    }

    public void displayForScoreB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForFoulB(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_b_foul);
        foulView.setText(String.valueOf(foul));
    }

    public void ScoreB(View view) {
        scoreb++;
        displayForScoreB(scoreb);

    }

    public void Foulb(View view) {
        foulb = foulb + 1;
        displayForFoulB(foulb);
    }


}
