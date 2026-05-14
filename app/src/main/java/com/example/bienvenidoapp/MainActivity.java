package com.example.bienvenidoapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_main);

        Button btnEnter = findViewById(R.id.btnEnter);
        btnEnter.setOnClickListener(v ->
            Toast.makeText(this, getString(R.string.enter), Toast.LENGTH_SHORT).show()
        );
    }
}
