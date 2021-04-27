package com.example.android81;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText login;
    private EditText password;
    private Button sign_up;
    private TextView register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.user_login);
        password = findViewById(R.id.password);
        sign_up = findViewById(R.id.btn_sign_in);

        login.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!login.getText().toString().isEmpty() && !password.getText().toString().isEmpty()) {
                    sign_up.setBackground(getResources().getDrawable(R.drawable.after_btn_background));
                } else {
                    sign_up.setEnabled(true);
                }
            }
        });
        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!login.getText().toString().isEmpty() && !password.getText().toString().isEmpty()) {
                    sign_up.setBackground(getResources().getDrawable(R.drawable.after_btn_background));
                } else {
                    sign_up.setEnabled(true);
                }
            }
        });


    }

    public void register(View view) {
        register = findViewById(R.id.registering);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signing = new Intent(MainActivity.this, Signing.class);
                startActivity(signing);
            }
        });
    }

    public void getStart(View view) {
        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(MainActivity.this,Home_page.class);
                startActivity(home);
            }
        });
    }
}