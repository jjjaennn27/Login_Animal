package com.example.login_animal;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton btnFood, btnSnack, btnWalk, btnHealth;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btnFood = findViewById(R.id.imgBtn1);
        btnFood.setOnClickListener(this);
        btnSnack = findViewById(R.id.imgBtn2);
        btnSnack.setOnClickListener(this);
        btnWalk = findViewById(R.id.imgBtn3);
        btnWalk.setOnClickListener(this);
        btnHealth = findViewById(R.id.imgBtn4);
        btnHealth.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imgBtn1:
                intent = new Intent(this, Register_Food.class);
                startActivity(intent);
                break;
            case R.id.imgBtn2:
                intent = new Intent(this, Register_Snack.class);
                startActivity(intent);
                break;
            case R.id.imgBtn3:
                intent = new Intent(this, Register_Run.class);
                startActivity(intent);
                break;
            case R.id.imgBtn4:
                intent = new Intent(this, Register_Health.class);
                startActivity(intent);
                break;
            default: break;
        }

    }
}