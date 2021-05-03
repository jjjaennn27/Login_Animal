package com.example.login_animal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Register_Run extends AppCompatActivity {

    ImageButton register;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.run);

        register = findViewById(R.id.imageButton);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(), Main.class);
                startActivity(intent);
            }
        });
    }
}
