package com.example.farmbnb;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        Button homeUserButton = findViewById(R.id.homeUserButton);
        homeUserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoHome();
            }
        });

        Button bookingUserButton = findViewById(R.id.bookingUserButton);
        bookingUserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoBooking();
            }
        });

        Button logoutUserButton = findViewById(R.id.logoutUserButton);
        logoutUserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoMainActivity();
            }
        });
    }

    private void gotoBooking() {
        Intent intent = new Intent(this, BookingActivity.class);
        startActivity(intent);
    }

    private void gotoHome() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }


    private void gotoMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}