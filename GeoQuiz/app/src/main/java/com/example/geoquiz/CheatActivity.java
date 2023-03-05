package com.example.geoquiz;

import android.app.Activity;
import android.os.Bundle;

public class CheatActivity extends Activity {
    public static final String EXTRA_ANSWER_IS_TRUE = "com.example.geoquiz.answer_is_true";

    private boolean mAnswerIsTrue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);

        mAnswerIsTrue = getIntent().getBooleanExtra(EXTRA_ANSWER_IS_TRUE, false);
    }
}
