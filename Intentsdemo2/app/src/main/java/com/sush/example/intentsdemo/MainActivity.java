package com.sush.example.intentsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button exlicit;
    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e=findViewById(R.id.et1)
        exlicit=findViewById(R.id.b1);
        exlicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Intent i1=new Intent(MainActivity.this,Second.class);
                startActivity(i1);
            }
        });
    }
    public void broser(View view) {
        Uri uri=Uri.parse("htpp://classroom.google.com/");
                Intent i2=new int(Intent.ACTION_VIEW,uri);
                startActivity(i2);
    }
}