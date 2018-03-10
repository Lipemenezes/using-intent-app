package com.felipe.intentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    // textUserInformation
    private TextView textUserInformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        this.init();
    }

    public void destroyThisActivity(View view) {
        this.finish();
    }

    private void init() {
        this.textUserInformation = findViewById(R.id.textUserInformation);

        Bundle extra = getIntent().getExtras();
        if (extra != null) {
            String username = extra.getString("username");
            String password = extra.getString("password");
            textUserInformation.setText(
                    username + " " + password
            );
        }
    }

}
