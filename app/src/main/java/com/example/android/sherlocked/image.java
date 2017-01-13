package com.example.android.sherlocked;

/**
 * Created by harish ghunawat on 1/3/2017.
 */

public class image {
    private int mImageResourceId = NO_IMAGE_FOUND;


    private static final int NO_IMAGE_FOUND=-1;

    public image(int imageResourceId){
           mImageResourceId = imageResourceId;

    }

    public int getImage() { return mImageResourceId; }
}
