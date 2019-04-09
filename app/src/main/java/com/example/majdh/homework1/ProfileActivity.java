package com.example.majdh.homework1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;

public class ProfileActivity extends AppCompatActivity {
    private static HashMap<Integer ,Profile_information> profiles = new HashMap<Integer, Profile_information>();;
    private Profile_information new_profile ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        int index = getIntent().getIntExtra("Item_Index", -1);
        if(index > -1)
        {
            switch (index)
            {
                case 0:
                    if(!profiles.containsKey(index))
                    {
                        new_profile = new Profile_information("Ali", "Connors", "(655) 123-4567", "(655)456-9999", "aliconnors@example.com", "ali_connors@example.com", R.drawable.ali_connors_img);
                        profiles.put(index, new_profile);
                    }
                    else
                        new_profile = profiles.get(index);
                    break;
                case 1:
                    if(!profiles.containsKey(index))
                    {
                        new_profile = new Profile_information("Aiham", "AbuRafaa", "(972) 54-6230958", "(972) 50-8259528", "aehm97@gmail.com", "aehm@runnableweb.com", R.drawable.aiham_aburafaa_img);
                        profiles.put(index, new_profile);
                    }
                    else
                        new_profile = profiles.get(index);
                    break;
                case 2:
                    if(!profiles.containsKey(index))
                    {
                        new_profile = new Profile_information("Mark", "zuckerberg", "(972) 50-6678904", "(973) 50-9094853", "mark15@gmail.com", "admin@facebook.com", R.drawable.mark_img);
                        profiles.put(index, new_profile);
                    }
                    else
                        new_profile = profiles.get(index);
                    break;
                case 3:
                    if(!profiles.containsKey(index))
                    {
                        new_profile = new Profile_information("Salam", "Abusaleh", "(972) 50-8679876", "(972) 50-3124567", "salam.abusaleh.3@hotmail.com", "salamas@apple.com", R.drawable.salam_img);
                        profiles.put(index, new_profile);
                    }
                    else
                        new_profile = profiles.get(index);
                    break;
                case 4:
                    if(!profiles.containsKey(index))
                    {
                        new_profile = new Profile_information("Ebrahem", "Farhat", "(972) 54-4564327", "(972) 58-9321239", "ebrahem@gmail.com", "ebrahem@runnableweb.com", R.drawable.ebrahem_img);
                        profiles.put(index, new_profile);
                    }
                    else
                        new_profile = profiles.get(index);
                    break;
            }
            fill_Information();
        }
    }

    private void fill_Information()
    {
        ImageView image = (ImageView)findViewById(R.id.ImageId);
        TextView personalName = (TextView)findViewById(R.id.NameTextView);
        TextView personal_phone_number = (TextView)findViewById(R.id.personal_phone_number);
        TextView work_phone_number = (TextView)findViewById(R.id.work_phone_number);
        TextView personal_email = (TextView)findViewById(R.id.personal_email);
        TextView work_email = (TextView)findViewById(R.id.work_email);
        TextView likes = (TextView)findViewById(R.id.likes_counter);
        image.setImageResource(new_profile.getImage());
        personalName.setText(new_profile.getFirst_name() + " " + new_profile.getLast_name());
        personal_phone_number.setText(new_profile.getPersonal_phone_number());
        work_phone_number.setText(new_profile.getWork_phone_number());
        personal_email.setText(new_profile.getPersonal_email());
        work_email.setText(new_profile.getWork_email());
        likes.setText(Integer.toString(new_profile.getLikes()));
    }

    public void goBack(View view)
    {
        finish();
    }

    public void updateLikes(View view)
    {
        TextView likes = (TextView)findViewById(R.id.likes_counter);
        int likes_count = new_profile.getLikes() + 1;
        likes.setText(Integer.toString(likes_count));
        new_profile.increment_likes();
    }
}
