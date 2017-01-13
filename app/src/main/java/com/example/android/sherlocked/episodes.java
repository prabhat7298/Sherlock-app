package com.example.android.sherlocked;

/**
 * Created by harish ghunawat on 1/3/2017.
 */

public class episodes {
    private String mWord;
    private int mImageResourceId = NO_IMAGE_FOUND;
    private String mShortSummary;
    private String mVideoLink;

    private static final int NO_IMAGE_FOUND=-1;

    public episodes( int imageResourceId, String word, String shortSummary, String videoLink ){
        mWord = word;
        mShortSummary = shortSummary;
        mImageResourceId = imageResourceId;
        mVideoLink = videoLink;

    }
    public String getWord(){
        return mWord;
    }
    public int getImage() { return mImageResourceId; }
    public String getShortSummary() {return mShortSummary;}
    public String getVideoLink(){return mVideoLink; }


}

