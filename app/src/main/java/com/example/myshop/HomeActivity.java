package com.example.myshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class HomeActivity extends AppCompatActivity {

    TextView tvWelcome;
    ImageButton ibFruits, ibVegetables, ibClothes, ibSnacks, ibMeats, ibDrinks;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Objects.requireNonNull(getSupportActionBar()).hide();
        initView();

        String username = getIntent().getStringExtra("USERNAME");
        tvWelcome.setText("Welcome, " + username + "!");

        onClickButtons(username);
    }

    private void initView() {
        tvWelcome = (TextView) findViewById(R.id.tv_welcome);
        ibFruits = (ImageButton) findViewById(R.id.ib_fruits);
        ibVegetables = (ImageButton) findViewById(R.id.ib_vegetables);
        ibClothes = (ImageButton) findViewById(R.id.ib_clothes);
        ibSnacks = (ImageButton) findViewById(R.id.ib_snacks);
        ibMeats = (ImageButton) findViewById(R.id.ib_meats);
        ibDrinks = (ImageButton) findViewById(R.id.ib_drinks);
    }

    private void onClickButtons(String username) {
        onClickIbFruits(username);
        onClickIbVegetables(username);
        onClickIbClothes(username);
        onClickIbSnacks(username);
        onClickIbMeats(username);
        onClickIbDrinks(username);
    }

    private void onClickIbFruits(String username) {
        ibFruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomeActivity.this, FruitActivity.class);
                intent.putExtra("USERNAME", username);
                startActivity(intent);
            }
        });
    }

    private void onClickIbVegetables(String username) {
        ibVegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomeActivity.this, VegetableActivity.class);
                intent.putExtra("USERNAME", username);
                startActivity(intent);
            }
        });
    }

    private void onClickIbClothes(String username) {
        ibClothes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomeActivity.this, ClothActivity.class);
                intent.putExtra("USERNAME", username);
                startActivity(intent);
            }
        });
    }

    private void onClickIbSnacks(String username) {
        ibSnacks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomeActivity.this, SnackActivity.class);
                intent.putExtra("USERNAME", username);
                startActivity(intent);
            }
        });
    }

    private void onClickIbMeats(String username) {
        ibMeats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomeActivity.this, MeatActivity.class);
                intent.putExtra("USERNAME", username);
                startActivity(intent);
            }
        });
    }

    private void onClickIbDrinks(String username) {
        ibDrinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomeActivity.this, DrinkActivity.class);
                intent.putExtra("USERNAME", username);
                startActivity(intent);
            }
        });
    }


}
