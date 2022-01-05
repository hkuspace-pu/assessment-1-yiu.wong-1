package com.example.farmbnb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class UserInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        Button homeUserButton = findViewById(R.id.homeUserButton);
        homeUserButton.setOnClickListener(view -> gotoHome());

        Button bookingUserButton = findViewById(R.id.bookUserButton);
        bookingUserButton.setOnClickListener(view -> gotoBooking());

        Button logoutUserButton = findViewById(R.id.logoutUserButton);
        logoutUserButton.setOnClickListener(view -> gotoMainActivity());
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