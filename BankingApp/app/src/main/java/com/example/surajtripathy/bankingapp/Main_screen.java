package com.example.surajtripathy.bankingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import stanford.androidlib.SimpleActivity;
import stanford.androidlib.SimpleList;

public class Main_screen extends SimpleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        ListView list = $(R.id.main_screen_list);
        SimpleList.with(this).setItems(list,"Fixed Rate", "Loan");
        list.setOnItemClickListener(this);
    }

    public void onItemClick(ListView view, int index)
    {
        if(index == 0)
        {
            Intent intent = new Intent(this,Fixed_rate.class);
            startActivity(intent);
        }

        if(index == 1)
        {
            Intent intent = new Intent(this,Loan.class);
            startActivity(intent);
        }
    }
}
