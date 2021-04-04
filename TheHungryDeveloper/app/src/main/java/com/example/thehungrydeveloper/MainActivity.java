package com.example.thehungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    CardView startersCard;
    CardView mainsCard;
    CardView dessertCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startersCard = findViewById(R.id.card_view_starters);
        mainsCard = findViewById(R.id.card_view_main_courses);
        dessertCard = findViewById(R.id.card_view_desserts);



        startersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startersActivityIntent = new Intent(MainActivity.this, StartersActivity.class);
                startActivity(startersActivityIntent);
            }
        });

        mainsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent mainCoursesActivityIntent = new Intent(MainActivity.this, MainCoursesActivity.class);
               startActivity(mainCoursesActivityIntent);
            }
        });

        dessertCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent dessertActivityIntent = new Intent(MainActivity.this, DessertsActivity.class);
              startActivity(dessertActivityIntent);
            }
        });


        TextView emailTextView = findViewById(R.id.text_view_email_adress);
        emailTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailLaunchingIntent = new Intent(Intent.ACTION_SENDTO);
                emailLaunchingIntent.setData(Uri.parse("mailto:thehungrydeveloper@gmail.com"));
                startActivity(emailLaunchingIntent);
            }
        });
    }
}