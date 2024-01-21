package com.example.important_abbreviation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

public class Networking_Abbreviation extends AppCompatActivity {
    private ListView listView;

    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.networking_abbreviation);

        listView = findViewById(R.id.network_ListView_Id);
        searchView = findViewById(R.id.SearchView_Id);


        String[] networkAbbreviaton = getResources().getStringArray(R.array.network_Text);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(Networking_Abbreviation.this,R.layout.sample_layout,R.id.textView,networkAbbreviaton);
        listView.setAdapter(adapter1);


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                adapter1.getFilter().filter(newText);

                return false;
            }
        });






    }
}