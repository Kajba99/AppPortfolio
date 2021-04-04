package com.example.thehungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ListView startersList = findViewById(R.id.list_view_starters);



        DishesList[] dishesLists = {
                new DishesList("Mushroom and tofu maki", "Toasted seaweed wrapped around sushi rice, filled with chestnut mushroom and smoked tofu",999),
                new DishesList("Egg and avocado uramaki", "Pasta in a sauce made from free range eggs and fresh avocado", 1199),
                new DishesList("Melon and lemon soup", "Fresh melon and lemon combined into creamy soup", 1199),
                new DishesList("Coconut and chocolate mousse","A creamy mousse made with fresh coconut and milk chocolate",899),
                new DishesList("Spinach and cabbage wontons", "Thin wonton cases stuffed with fresh spinach and chinese cabbage", 799),
                new DishesList("Broccoli and cucumber soup", "Fresh broccoli and cucumber combined into creamy soup", 899),
                new DishesList("Chilli and aubergine dip", "A dip made from scotch bonnet chilli and fresh aubergine", 999),
                new DishesList("Chickpea and chilli gyoza", "Thin pastry cases stuffed with fresh chickpea and green chilli", 699),
                new DishesList("Sprout and pineapple soup", "Fresh sprout and pineapple combined into creamy soup", 899),
                new DishesList("Egusi and borscht soup", "Egusi and borscht combined into creamy soup", 1299)

        };

        ArrayAdapter<DishesList> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishesLists);
        startersList.setAdapter(dishesAdapter);



    }



}