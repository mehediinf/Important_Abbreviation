package com.example.important_abbreviation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button networkButton,dataCommunicationButton,sequentialLogicButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        networkButton = findViewById(R.id.network_Id);
        dataCommunicationButton = findViewById(R.id.dataCommunication_Id);
        sequentialLogicButton = findViewById(R.id.sequentialLogic_Id);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);


        return super.onCreateOptionsMenu(menu);
    }

    public void clickMessage(View v){

        if (v.getId()==R.id.network_Id){
            Intent intent = new Intent(MainActivity.this,Networking_Abbreviation.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.dataCommunication_Id){
            Intent intent = new Intent(MainActivity.this,Datacommunication_Abbreviation.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.sequentialLogic_Id){
            Intent intent = new Intent(MainActivity.this,Sequentiallogic_Abbreviation.class);
            startActivity(intent);
        }
    }



}