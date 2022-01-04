package com.example.farmbnb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.logIn);
        loginButton.setOnClickListener(new View.OnClickListener() {
            EditText userid = (EditText)findViewById(R.id.editTextTextPersonName);
            EditText password = (EditText)findViewById(R.id.editTextTextPassword);

            @Override
            public void onClick(View view) {
                if (userid.getText().toString().equals("user01") && password.getText().toString().equals("123456")) {
                    gotoUserInfo();
                } else {
                    Toast.makeText(getApplicationContext(), "UserID / Password pair is INVALID", Toast.LENGTH_LONG).show();
                    gotoMainActivity();
                }
            }
        });

            Button signupButton = findViewById(R.id.signUp);
            signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoSignup();
            }
        });
    }

        private void gotoUserInfo() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
        }

        private void gotoSignup() {
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
        }

        private void gotoMainActivity() {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

    }
