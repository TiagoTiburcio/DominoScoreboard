package com.example.tiagoc.dominoscoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mViewHolder.scoreATextView = findViewById(R.id.score_1_text_view);
        this.mViewHolder.scoreBTextView = findViewById(R.id.score_2_text_view);
        this.mViewHolder.scoreCTextView = findViewById(R.id.score_3_text_view);
        this.mViewHolder.scoreDTextView = findViewById(R.id.score_4_text_view);
    }

    /**
     * This method increment the scores in display
     * @param scoreNumber
     */
    private void incrementScore(int scoreNumber){
        int score;
        switch (scoreNumber){
            case 1:
                score = Integer.valueOf(this.mViewHolder.scoreATextView.getText().toString()) + 1;
                this.mViewHolder.scoreATextView.setText(String.valueOf(score));
                break;
            case 2:
                score = Integer.valueOf(this.mViewHolder.scoreBTextView.getText().toString()) + 1;
                this.mViewHolder.scoreBTextView.setText(String.valueOf(score));
                break;
            case 3:
                score = Integer.valueOf(this.mViewHolder.scoreCTextView.getText().toString()) + 1;
                this.mViewHolder.scoreCTextView.setText(String.valueOf(score));
                break;
            case 4:
                score = Integer.valueOf(this.mViewHolder.scoreDTextView.getText().toString()) + 1;
                this.mViewHolder.scoreDTextView.setText(String.valueOf(score));
                break;
        }
    }

    /**
     * This method called Linear layout A
     * @param view
     */
    public void incrementScoreA(View view) {
        incrementScore(1);
    }

    /**
     * This method called Linear layout B
     * @param view
     */
    public void incrementScoreB(View view) {
        incrementScore(2);
    }

    /**
     * This method called Linear layout C
     * @param view
     */
    public void incrementSocreC(View view) {
        incrementScore(3);
    }

    /**
     * This method called Linear layout D
     * @param view
     */
    public void incrementSocreD(View view) {
        incrementScore(4);
    }

    /**
     * This method called to Reset All Scores in Display
     * @param view
     */
    public void resetScores(View view) {
        this.mViewHolder.scoreATextView.setText(String.valueOf(0));
        this.mViewHolder.scoreBTextView.setText(String.valueOf(0));
        this.mViewHolder.scoreCTextView.setText(String.valueOf(0));
        this.mViewHolder.scoreDTextView.setText(String.valueOf(0));
    }

    /**
     * Default View Holder
     */
    private static class ViewHolder{
        TextView scoreATextView;
        TextView scoreBTextView;
        TextView scoreCTextView;
        TextView scoreDTextView;
    }
}
