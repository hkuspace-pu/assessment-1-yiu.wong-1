package com.example.farmbnb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button homeSignupButton = findViewById(R.id.homeSignupButton);
        homeSignupButton.setOnClickListener(view -> gotoMainActivity());

        Button confirmSignupButton = findViewById(R.id.confirmSignupButton);
        confirmSignupButton.setOnClickListener(view -> {
            Toast.makeText(getApplicationContext(), "User Created Successfully", Toast.LENGTH_SHORT).show();
            gotoUserInfo();
        });

    }

    private void gotoMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void gotoUserInfo() {
        Intent intent = new Intent(this, UserInfoActivity.class);
        startActivity(intent);
    }
}