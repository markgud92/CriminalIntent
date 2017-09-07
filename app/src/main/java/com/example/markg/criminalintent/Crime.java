package com.example.markg.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by markg on 29/07/2017.
 */

public class Crime {

    private UUID mId;
    private String mTitle;
    private boolean mSolved;
    private Date mDate;
    private int mPosition;

    public Crime() {

        //Unique Identifier generator
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {

        return mId;
    }

    @Override
    public String toString() {
        return mTitle;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {

        mTitle = title;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }


    public void setPosition(int position) {
        mPosition = position;
    }
}
