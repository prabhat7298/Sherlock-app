package com.example.android.sherlocked;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static int s_Index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<image> seasons = new ArrayList<image>();

        seasons.add(new image(R.drawable.s1));
        seasons.add(new image(R.drawable.s2));
        seasons.add(new image(R.drawable.s3));
        seasons.add(new image(R.drawable.s4));



        ImageAdapter itemsAdapter = new ImageAdapter(this, seasons);
        final ListView listView = (ListView) findViewById(R.id.activity_main);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

              s_Index = position;
                Log.v("value  of index","" + s_Index);


                if(s_Index == 0){
                    Intent i = new Intent(MainActivity.this, Season1.class);
                    startActivity(i);
                }
                else if(s_Index == 1){
                    Intent i = new Intent(MainActivity.this, Season2.class);
                    startActivity(i);
                }
                else if (s_Index == 2){
                    Intent i = new Intent(MainActivity.this, Season3.class);
                    startActivity(i);
                }
                else if(s_Index == 3){
                    Intent i = new Intent(MainActivity.this, Season4.class);
                    startActivity(i);
                }
            }
        });





    }
}
