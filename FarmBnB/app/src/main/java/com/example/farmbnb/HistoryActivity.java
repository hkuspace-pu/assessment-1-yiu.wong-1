package com.example.farmbnb;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        @SuppressLint("WrongViewCast") ImageButton userHistoryIcon = findViewById(R.id.userHistoryIcon);
        userHistoryIcon.setOnClickListener(view -> gotoUserInfo());
    }

    private void gotoUserInfo(){
        Intent intent = new Intent(this, UserInfoActivity.class);
        startActivity(intent);

    }
}
