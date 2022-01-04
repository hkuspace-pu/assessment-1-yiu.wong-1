package com.example.farmbnb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ConfirmBookingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_booking);

    ImageButton imageButtonUserIcon = findViewById(R.id.imageButtonUserIcon);
        imageButtonUserIcon.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View view){
        gotoUserInfo();
    }

    });

        Button homeConfirmButton = findViewById(R.id.homeConfirmButton);
        homeConfirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoHome();
            }
        });
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