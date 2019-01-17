package com.afkapps.android.geoquiz;

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public boolean isAlrearyAnswered() {
        return mAlrearyAnswered;
    }

    public void setAlrearyAnswered(boolean pAlrearyAnswered) {
        mAlrearyAnswered = pAlrearyAnswered;
    }

    private boolean mAlrearyAnswered;

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int pTextResId) {
        mTextResId = pTextResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean pAnswerTrue) {
        mAnswerTrue = pAnswerTrue;
    }

    public Question(int textResId, boolean answerTrue ) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

}
