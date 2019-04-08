package com.example.majdh.homework1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemsAdapter extends BaseAdapter {

    LayoutInflater myInflater;
    String[] profiles;
    int[] images;

    public ItemsAdapter(Context c, String[] p, int[] i)
    {
        myInflater = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.profiles = p;
        this.images = i;
    }

    @Override
    public int getCount() {
        return profiles.length;
    }

    @Override
    public Object getItem(int position) {
        return profiles[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View v = myInflater.inflate(R.layout.listview_profile_details, null);
        ImageView profile_image = (ImageView)v.findViewById(R.id.profile_imageView);
        TextView profile_name = (TextView)v.findViewById(R.id.profileName_textView);
        profile_image.setImageResource(images[position]);
        profile_name.setText(profiles[position]);
        return v;
    }
}
