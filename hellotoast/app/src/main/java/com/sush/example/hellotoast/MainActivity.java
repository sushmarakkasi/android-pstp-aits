package com.sush.example.hellotoast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.tv);
        if(savedInstanceState!=null&&savedInstanceState.containsKey("anykey")){
            count=savedInstanceState.getInt()
                    text.setText(String.valueOf(count));
        }
    }
    public void showToast(View View) {
        /*syntax of thje toast message*/
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show()
    }

    public void showCount(View view) {
        Count++;
        text.setText(String.valueOf(Count());
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("anykey",count);
    }
}
}


