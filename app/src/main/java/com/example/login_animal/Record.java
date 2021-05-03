package com.example.login_animal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Record extends AppCompatActivity {

    Button mbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.record);

        mbutton = findViewById(R.id.savebutton);

        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Record.this, Calendar.class);
                startActivity(myIntent);
                finish();
            }
        });
    }
}