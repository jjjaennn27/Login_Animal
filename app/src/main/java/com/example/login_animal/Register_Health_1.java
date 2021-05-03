package com.example.login_animal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Register_Health_1 extends AppCompatActivity {

    ImageButton add;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.health_2);

        add = findViewById(R.id.imgBtn6);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(), Main.class);
                startActivity(intent);
            }
        });
    }
}

