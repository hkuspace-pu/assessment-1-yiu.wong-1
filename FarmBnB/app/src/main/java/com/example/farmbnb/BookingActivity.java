package com.example.farmbnb;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class BookingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        ImageButton userBookingIcon = findViewById(R.id.userBookingIcon);
        userBookingIcon.setOnClickListener(view -> gotoUserInfo());

        ImageButton farmButton = findViewById(R.id.farmButton);
        farmButton.setOnClickListener(view -> gotoFarmActivity());

        ImageButton barnButton = findViewById(R.id.barnButton);
        barnButton.setOnClickListener(view -> gotoBarnActivity());

        ImageButton hutButton = findViewById(R.id.hutButton);
        hutButton.setOnClickListener(view -> gotoHutActivity());

        Button homeBookingButton = findViewById(R.id.homeBookingButton);
        homeBookingButton.setOnClickListener(view -> gotoHome());
    }

        private void gotoFarmActivity(){
        Intent intent = new Intent(this, FarmHouseActivity.class);
        startActivity(intent);

    }

        private void gotoBarnActivity(){
        Intent intent = new Intent(this, BarnActivity.class);
        startActivity(intent);

    }

        private void gotoHutActivity(){
        Intent intent = new Intent(this, HutActivity.class);
        startActivity(intent);

    }

        private void gotoUserInfo(){
        Intent intent = new Intent(this, UserInfoActivity.class);
        startActivity(intent);

    }

        private void gotoHome() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

}