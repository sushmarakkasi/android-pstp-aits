package com.sush.example.androidmenus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.security.KeyStore;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    int date,month,year,min,hours;
    Button btn;
    Spinner sp;
    TextView textView_lable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       btn=findViewById(R.id.tv);
       sp=findViewById(R.id.spin);
       textView_lable=findViewById(R.id.tv);
       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String myHero=sp.getSelectedItem().toString();
               textView_lable.setText(myHero);
           }
       });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.alert:
                showAlert();
                break;
            case R.id.datapicker:
                showdatepicker();
                        break;
            case R.id.timepicker:
                showtimepicker();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void showtimepicker() {
        Calendar c=Calendar.getInstance();
        hours=c.get(Calendar.HOUR);
        min=c.get(Calendar.MINUTE);
        TimePickerDialog dialog=new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                String time=hourOfDay+"-"+minute;
                Toast.makeText(MainActivity.this, "select your time is:"+time, Toast.LENGTH_SHORT).show();
            }
        },hours,min,true);
        //Toast.makeText(this, "Item Time picker", Toast.LENGTH_SHORT).show();
    }

    private void showdatepicker() {
        Calendar c=Calendar.getInstance();


        //Toast.makeText(this, "Item date picker", Toast.LENGTH_SHORT).show();
    }

    private void showAlert() {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Alert..!");
        builder.setMessage("Do u want close the app");
        builder.setIcon(R.drawable.ic_baseline_warning_24);
        builder.setCancelable(false);
        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
                builder.setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
            }
        });
        builder.show();
        //Toast.makeText(this, "Item Alert", Toast.LENGTH_SHORT).show();
    }
}