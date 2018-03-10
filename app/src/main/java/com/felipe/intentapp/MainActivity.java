package com.felipe.intentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editUsername;
    private EditText editPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.init();
    }

    public void openSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("username", editUsername.getText().toString());
        intent.putExtra("password", editPassword.getText().toString());

        startActivity(intent);
    }

    private void init() {
        this.editUsername = findViewById(R.id.editUsername);
        this.editPassword = findViewById(R.id.editPassword);
    }

}
