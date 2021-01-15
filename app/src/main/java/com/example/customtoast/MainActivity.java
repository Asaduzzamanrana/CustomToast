package com.example.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button loginbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginbutton = findViewById(R.id.loginid);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
                View customview = inflater.inflate(R.layout.customtoast_layout, (ViewGroup) findViewById(R.id.customid));

                Toast toast= new Toast(MainActivity.this);
                toast.setView(customview);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
            }

        });
    }

}
