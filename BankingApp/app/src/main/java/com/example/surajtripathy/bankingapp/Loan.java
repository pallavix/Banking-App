package com.example.surajtripathy.bankingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import stanford.androidlib.SimpleActivity;
import stanford.androidlib.SimpleList;

public class Loan extends SimpleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan);

        ListView list = $(R.id.loan_list);
        SimpleList.with(this).setItems(list,"Housing", "Whatever I can't read");
        list.setOnItemClickListener(this);
    }

    public void onItemClick(ListView view, int index)
    {
        toast("Loan");
    }
}
