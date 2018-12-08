package com.example.surajtripathy.bankingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import stanford.androidlib.SimpleActivity;
import stanford.androidlib.SimpleList;

public class Fixed_rate extends SimpleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fixed_rate);

        ListView list = $(R.id.fixed_rate_list);
        SimpleList.with(this).setItems(list,"4 months", "6 months", "1 year", "10 years");
        list.setOnItemClickListener(this);
    }

    public void onItemClick(ListView view, int index)
    {
        toast("Fixed Rate");
    }

}
