package com.himadri_parikh.lab6_autocomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Step 1 - local references / instantiation
    AutoCompleteTextView autoComplete;
    String[] countries = new String[]{"India", "Mexico", "France", "Myanmar", "Bhutan", "Nepal", "Sri Lanka", "Canada", "Mozambique", "South Africa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step 2 - binding views
        autoComplete = findViewById(R.id.autoComplete);

        //Step 3 - implement adapter
        ArrayAdapter<String> adt = new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                countries);
        autoComplete.setAdapter(adt);


    }
}