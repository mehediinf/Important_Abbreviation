package com.example.important_abbreviation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

public class Datacommunication_Abbreviation extends AppCompatActivity {

    private ListView listView;
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datacommunication_abbreviation);

        listView = findViewById(R.id.DataCommunication_ListView_Id);
        searchView = findViewById(R.id.SearchView_Id);



        String[] datacommunication = getResources().getStringArray(R.array.dataCommunication_Text);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Datacommunication_Abbreviation.this,R.layout.sample_layout,R.id.textView,datacommunication);
        listView.setAdapter(adapter);


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                adapter.getFilter().filter(newText);

                return false;
            }
        });


    }
}