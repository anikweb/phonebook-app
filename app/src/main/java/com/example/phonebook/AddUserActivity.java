package com.example.phonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class AddUserActivity extends AppCompatActivity {

    TextView add_user_page_back_btn;
    Spinner spinner;
    String[] sim = {"SIM 1","SIM 2","example@gmail.com"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        add_user_page_back_btn = findViewById(R.id.add_user_page_back_btn);
        spinner = findViewById(R.id.sim_spinner);


        ArrayAdapter<String> SIMAadapter = new ArrayAdapter<>(
                AddUserActivity.this,
                android.R.layout.simple_list_item_1,
                sim
        );

        spinner.setAdapter(SIMAadapter);









        add_user_page_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               AddUserActivity.super.onBackPressed();
               finish();
            }
        });
    }
}