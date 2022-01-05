package com.example.farmbnb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class ConfirmFarmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_farm);

        ImageButton userConfirmFarmIcon = findViewById(R.id.userConfirmFarmIcon);
        userConfirmFarmIcon.setOnClickListener(view -> gotoUserInfo());

        Button homeConfirmFarmButton = findViewById(R.id.homeConfirmFarmButton);
        homeConfirmFarmButton.setOnClickListener(view -> gotoHome());
    }
    private void gotoUserInfo() {
        Intent intent = new Intent(this, UserInfoActivity.class);
        startActivity(intent);
    }

    private void gotoHome() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}