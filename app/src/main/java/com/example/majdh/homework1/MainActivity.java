package com.example.majdh.homework1;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] profiles;
    int[] images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView profile_listView = (ListView)findViewById(R.id.profilesListView);
        Resources res = getResources();
        profiles = res.getStringArray(R.array.profiles);
        images = new int[profiles.length];
        fill_images();
        ItemsAdapter itemsAdapter = new ItemsAdapter(this, profiles, images);
        profile_listView.setAdapter(itemsAdapter);

        profile_listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent goToProfileIntent = new Intent(getApplicationContext(), ProfileActivity.class);
                goToProfileIntent.putExtra("Item_Index", position);
                startActivity(goToProfileIntent);
            }
        });

    }

    private void fill_images()
    {
        images[0] = R.drawable.ali_connors_img;
        images[1] = R.drawable.aiham_aburafaa_img; //need change
        images[2] = R.drawable.mark_img; //need change
        images[3] = R.drawable.ali_connors_img; //need change
        images[4] = R.drawable.ali_connors_img; //need change
    }
}
