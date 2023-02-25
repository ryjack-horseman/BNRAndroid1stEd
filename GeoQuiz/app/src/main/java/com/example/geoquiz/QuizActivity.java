package com.example.geoquiz;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class QuizActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }

    //not identical to book, book inflates: getMenuInflator.inflate(R.menu.activity_quiz, menu) but
    //AS no longer generates similar projects, so rather than attempting to figure out the contents
    //of the menu and reproduce it, i have left the default implementation in.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }
}
