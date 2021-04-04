package com.example.thehungrydeveloper;

import androidx.annotation.NonNull;

public class DishesList {

  String title;
  String description;
  int price;

  DishesList(String title, String description, int price)  {
    this.title  =  title;
    this.description = description;
    this.price = price;


  }
    @NonNull
    @Override
    public String toString()  {
    return title;
  }



}
