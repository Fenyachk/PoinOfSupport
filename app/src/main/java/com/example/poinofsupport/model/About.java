package com.example.poinofsupport.model;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.poinofsupport.R;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_about_company);

        TextView titleTextView = findViewById(R.id.aboutCompanyTitle);
        TextView descriptionTextView = findViewById(R.id.aboutCompanyDescription);

        titleTextView.setText("О нашей компании");

    }

}
