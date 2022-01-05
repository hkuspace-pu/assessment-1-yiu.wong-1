package com.example.farmbnb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class ConfirmBarnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_barn);

        ImageButton userConfirmBarnIcon = findViewById(R.id.userConfirmBarnIcon);
        userConfirmBarnIcon.setOnClickListener(view -> gotoUserInfo());

        Button homeConfirmBarnButton = findViewById(R.id.homeConfirmBarnButton);
        homeConfirmBarnButton.setOnClickListener(view -> gotoHome());
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