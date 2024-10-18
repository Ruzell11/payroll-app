package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private EditText email, password;
    private Button loginButton;
    private TextView signupText; // Declare the signupText TextView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Ensure this matches your layout file name

        email = findViewById(R.id.email); // Make sure this ID matches your EditText for email
        password = findViewById(R.id.password); // Make sure this ID matches your EditText for password
        loginButton = findViewById(R.id.loginButton);
        signupText = findViewById(R.id.signupText); // Get the signupText TextView

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PayrollDashboard.class);
                startActivity(intent);
            }
        });

        // Set OnClickListener for the signupText TextView
        signupText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start SignUpActivity
                Intent intent = new Intent(MainActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });
    }
}