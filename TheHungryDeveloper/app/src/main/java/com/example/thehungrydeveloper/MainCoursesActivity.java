package com.example.thehungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainCoursesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);

        ListView mainCoursesList = findViewById(R.id.list_view_main_courses);


      DishesList [] dishesLists = {
              new DishesList("Thai basil and mulberry salad", "A crisp salad featuring fresh thai basil and mulberry", 1499),
              new DishesList("Onion and apple ciabatta", "Warm ciabatta filled with caramalised onion and fresh apple", 1299),
              new DishesList("Onion and olive bread", "Crunchy bread made with baby onion and olive", 1199),
              new DishesList("Onion and mustard soup", "Dried onion and French mustard combined into smooth soup", 1299),
              new DishesList("Samphire and rocket salad", "Samphire and fresh rocket served on a bed of lettuce", 1599),
              new DishesList("Cocoa and chicory salad", "Cocoa and chicory served on a bed of lettuce", 1699),
              new DishesList("Cauliflower and squash curry", "Mild curry made with fresh cauliflower and butternut squash", 1499),
              new DishesList("Cauliflower and potato madras", "Medium-hot madras made with fresh cauliflower and new potato", 1399)

      };

        ArrayAdapter<DishesList> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishesLists);
        mainCoursesList.setAdapter(dishesAdapter);

    }
}