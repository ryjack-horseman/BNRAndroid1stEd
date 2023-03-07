package com.example.geoquiz;

public class TrueFalse {
    private int mQuestion;

    private boolean mTrueQuestion;
    private boolean mWasCheated;

    public TrueFalse(int mQuestion, boolean mTrueQuestion) {
        this.mQuestion = mQuestion;
        this.mTrueQuestion = mTrueQuestion;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int mQuestion) {
        this.mQuestion = mQuestion;
    }

    public boolean getWasCheated(){
        return mWasCheated;
    }

    public void setCheated(boolean didCheat){
        mWasCheated = didCheat;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean mTrueQuestion) {
        this.mTrueQuestion = mTrueQuestion;
    }
}
