package com.example.myshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class VegetableActivity extends AppCompatActivity {

    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetable);
        Objects.requireNonNull(getSupportActionBar()).hide();
        initView();
        String username = getIntent().getStringExtra("USERNAME");
        onClickBack(username);
    }

    private void initView() {
        btnBack = (Button) findViewById(R.id.btn_back_vegetables);
    }

    private void onClickBack(String username) {
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VegetableActivity.this, HomeActivity.class);
                intent.putExtra("USERNAME", username);
                startActivity(intent);
            }
        });
    }
}