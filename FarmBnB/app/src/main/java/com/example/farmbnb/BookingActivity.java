package com.example.farmbnb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BookingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        Button bookBookingButton = findViewById(R.id.bookBookingButton);
        bookBookingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { gotoConfirmbooking(); }
        });
    }

        private void gotoConfirmbooking() {
        Intent intent = new Intent(this, ConfirmBookingActivity.class);
        startActivity(intent);
    }

}