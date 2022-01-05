package com.example.farmbnb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton userHomeIcon = findViewById(R.id.userHomeIcon);
        userHomeIcon.setOnClickListener(view -> gotoUserInfo());

        Button bookHomeButton = findViewById(R.id.bookHomeButton);
        bookHomeButton.setOnClickListener(view -> gotoBooking());
        }

    private void gotoUserInfo() {
            Intent intent = new Intent(this, UserInfoActivity.class);
            startActivity(intent);
    }

    private void gotoBooking() {
        Intent intent = new Intent(this, BookingActivity.class);
        startActivity(intent);
    }

}