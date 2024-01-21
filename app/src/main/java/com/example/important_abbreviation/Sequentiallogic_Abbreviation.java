package com.example.important_abbreviation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Sequentiallogic_Abbreviation extends AppCompatActivity {
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sequentiallogic_abbreviation);

        listView = findViewById(R.id.sequentialLogic_ListView_Id);



        String[] sequentiallogic_abbreviaton = getResources().getStringArray(R.array.sequential_Logic_Text);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(Sequentiallogic_Abbreviation.this,R.layout.sample_layout,R.id.textView,sequentiallogic_abbreviaton);
        listView.setAdapter(adapter3);


    }
}