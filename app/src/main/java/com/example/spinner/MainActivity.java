package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener{
    String[]Countries={"Moldova","Germany","GrBr"
            ,"Italy","USA","Sweden"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner)
                findViewById(R.id.simpleSpinner);

        spinner.setOnItemSelectedListener(this);
//Creating the ArrayAdapter instance having         the list of Countries
        ArrayAdapter adapt1 = new
                ArrayAdapter(this,android.R.layout.simple_spinner_item,Countries);
        adapt1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//Setting the ArrayAdapter data on the        Spinner
        spinner.setAdapter(adapt1);

    }

    @Override
    public void
    onItemSelected(AdapterView<?> arg0, View
            arg1, int position,long id) {

        Toast.makeText(getApplicationContext(),
                Countries[position],
                Toast.LENGTH_LONG).show();
        switch (arg1.getId())
        { case R.id.simpleSpinner:

            Toast.makeText(getApplicationContext(),
                    Countries[position],
                    Toast.LENGTH_LONG).show();
            break;
        }
    }
    @Override
    public void
    onNothingSelected(AdapterView<?> arg0) {
// TODO Auto-generated method stub
    }




}