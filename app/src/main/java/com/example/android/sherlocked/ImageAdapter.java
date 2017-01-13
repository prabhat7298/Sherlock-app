package com.example.android.sherlocked;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by harish ghunawat on 1/3/2017.
 */

public class ImageAdapter extends ArrayAdapter<image> {
    private static final String LOG_TAG = EpisodesAdapter.class.getSimpleName();

    public ImageAdapter(Activity context, ArrayList<image> imagelist){
        super(context,0,imagelist);
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        final image currentImage = getItem(position);

        ImageView imageList = (ImageView) listItemView.findViewById(R.id.seasonImages);


        if(currentImage.getImage()== -1) { imageList.setVisibility(View.GONE);}
        else{imageList.setImageResource(currentImage.getImage());}
        return listItemView;
    }
}
