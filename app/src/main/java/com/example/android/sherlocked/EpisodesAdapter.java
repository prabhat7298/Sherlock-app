package com.example.android.sherlocked;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.sherlocked.Config.YOUTUBE_LINK;


/**
 * Created by harish ghunawat on 1/3/2017.
 */

public class EpisodesAdapter extends ArrayAdapter<episodes> {
    private static final String LOG_TAG = EpisodesAdapter.class.getSimpleName();
    public static int epi_no = -1;
    public EpisodesAdapter(Activity context, ArrayList<episodes> wordlist){
        super(context,0,wordlist);
           }
    @NonNull
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
         epi_no = position;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_episodes, parent, false);
        }
        final episodes currentEpisodes = getItem(position);

        ImageView imageList = (ImageView) listItemView.findViewById(R.id.episodeImages);
        TextView textlist = (TextView)  listItemView.findViewById(R.id.epsiode_no_);
        textlist.setText(currentEpisodes.getWord());

        final TextView hiddenText = (TextView) listItemView.findViewById(R.id.shortSummary);
        hiddenText.setText(currentEpisodes.getShortSummary());

       View layout = listItemView.findViewById(R.id.episode);

        final View hiddenLayout =  listItemView.findViewById(R.id.hiddenLayout);

       final TextView link = (TextView) listItemView.findViewById(R.id.link);

        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(epi_no == 0){

                    if(hiddenLayout.getVisibility() == View.GONE)
                    {hiddenLayout.setVisibility(View.VISIBLE);
                        link.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent i = new Intent(getContext(), Video.class);
                                getContext().startActivity(i);
                                YOUTUBE_LINK = currentEpisodes.getVideoLink();
                            }
                        });
                    }
                    else
                    {hiddenLayout.setVisibility(View.GONE); }
                }
                else if(epi_no== 1){


                    if(hiddenLayout.getVisibility() == View.GONE)
                    {hiddenLayout.setVisibility(View.VISIBLE);
                        link.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent i = new Intent(getContext(), Video.class);
                                getContext().startActivity(i);
                                YOUTUBE_LINK = currentEpisodes.getVideoLink();
                            }
                        });
                    }
                    else
                    {hiddenLayout.setVisibility(View.GONE); }


                }
                else if(epi_no == 2){


                    if(hiddenLayout.getVisibility() == View.GONE)
                    {hiddenLayout.setVisibility(View.VISIBLE);
                        link.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent i = new Intent(getContext(), Video.class);
                                getContext().startActivity(i);
                                YOUTUBE_LINK = currentEpisodes.getVideoLink();
                            }
                        });
                    }
                    else
                    {hiddenLayout.setVisibility(View.GONE); }


                }
                else if(epi_no == 3){


                    if(hiddenLayout.getVisibility() == View.GONE)
                    {hiddenLayout.setVisibility(View.VISIBLE);
                        link.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent i = new Intent(getContext(), Video.class);
                                getContext().startActivity(i);
                                YOUTUBE_LINK = currentEpisodes.getVideoLink();
                            }
                        });
                    }
                    else
                    {hiddenLayout.setVisibility(View.GONE); }


                }
            }
        });




          if(currentEpisodes.getImage()== -1) { imageList.setVisibility(View.GONE);}
        else{imageList.setImageResource(currentEpisodes.getImage());}
        return listItemView;
    }

}
