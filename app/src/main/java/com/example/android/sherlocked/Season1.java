package com.example.android.sherlocked;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Season1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.episodes);



      ArrayList<episodes> episodelist1 = new ArrayList<>();

        episodelist1.add(new episodes(R.drawable.s1e0, "Episode 0","Invalided home from the war in Afghanistan, Dr. John Watson becomes roommates ...",""));
        episodelist1.add(new episodes(R.drawable.s1e1, "Episode 1","War vet Dr. John Watson returns to London in need of a place to stay. He meets ...","MiglWGPP0nA"));
        episodelist1.add(new episodes(R.drawable.s1e2, "Episode 2","Mysterious symbols and murders are showing up all over London, leading Sherlock ...","y_GGbRkqqFg"));
        episodelist1.add(new episodes(R.drawable.s1e3, "Episode 3","Mycroft needs Sherlock's help, but a remorseless criminal mastermind ...","AviDWKhmVdU"));
        EpisodesAdapter itemsAdapter = new EpisodesAdapter(this, episodelist1);
        ListView listView = (ListView) findViewById(R.id.epi);
        listView.setAdapter(itemsAdapter);




    }
}
