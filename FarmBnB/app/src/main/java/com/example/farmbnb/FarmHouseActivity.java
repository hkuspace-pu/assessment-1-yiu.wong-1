package com.example.farmbnb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

public class FarmHouseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farm_house);

        Spinner dropdown = findViewById(R.id.farmSpinner);
        String[] items = new String[]{"Bedroom 1", "Bedroom 2", "Bedroom 3"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        dropdown.setAdapter(adapter);

        ImageButton userFarmIcon = findViewById(R.id.userFarmIcon);
        userFarmIcon.setOnClickListener(view -> gotoUserInfo());
    }

    private void gotoUserInfo(){
        Intent intent = new Intent(this, UserInfoActivity.class);
        startActivity(intent);

    }
}