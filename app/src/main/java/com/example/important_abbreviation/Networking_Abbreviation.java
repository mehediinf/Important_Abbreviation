package com.example.important_abbreviation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Networking_Abbreviation extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.networking_abbreviation);

        listView = findViewById(R.id.network_ListView_Id);


        String[] networkAbbreviaton = getResources().getStringArray(R.array.network_Text);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(Networking_Abbreviation.this,R.layout.sample_layout,R.id.textView,networkAbbreviaton);
        listView.setAdapter(adapter1);







    }
}