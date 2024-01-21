package com.example.important_abbreviation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

public class Sequentiallogic_Abbreviation extends AppCompatActivity {
    private ListView listView;

    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sequentiallogic_abbreviation);

        listView = findViewById(R.id.sequentialLogic_ListView_Id);
        searchView = findViewById(R.id.SearchView_Id);



        String[] sequentiallogic_abbreviaton = getResources().getStringArray(R.array.sequential_Logic_Text);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(Sequentiallogic_Abbreviation.this,R.layout.sample_layout,R.id.textView,sequentiallogic_abbreviaton);
        listView.setAdapter(adapter3);


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                adapter3.getFilter().filter(newText);

                return false;
            }
        });

    }
}