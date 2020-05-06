package com.example.aplikasilogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView link_signup ;




        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            final Button button = (Button) findViewById(R.id.btn_login);
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
// Perform action on click
                    Intent activityChangeIntent = new Intent(MainActivity.this, Login.class);

// currentContext.startActivity(activityChangeIntent);

                    MainActivity.this.startActivity(activityChangeIntent);
                }
            });


            final Button regis = (Button) findViewById(R.id.btn_register);
            regis.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
// Perform action on click
                    Intent activityChangeIntent = new Intent(MainActivity.this, Register.class);

// currentContext.startActivity(activityChangeIntent);

                    MainActivity.this.startActivity(activityChangeIntent);
                }
            });




        }
    }
