package com.sush.example.registrationfrom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Toast;

import com.sush.example.registrationfrom.databinding.ActivityDetaipsBinding;
import com.sush.example.registrationfrom.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    String gender, knowsources,UserRatig,userprogess;
    private Object view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "Your button is on State", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "your button is Off State", Toast.LENGTH_SHORT).show();
                }

            }
        });
        binding.rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                binding.tvResultRating.setText("Rating is :" + rating);

            }
        });
        binding.sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    public void showData(View view) {
            String name=binding.etUsername.getText().toString();
            String email=binding.etUsermail.getText().toString();
            String mobile=binding.etUserMobileNumber.getText().toString();
            String password=binding.etUserpassword.getText().toString();
            String address=binding.etAddress.getText().toString();

            if (binding.male.isChecked()){
                gender="Male";
            }else if(binding.female.isChecked()){
                gender="Female";
            }

                Intent intentobj=new Intent(this,detaipsActivity.class);
                intentobj.putExtra("myname",name);
                intentobj.putExtra("myemail",email);
                intentobj.putExtra("mymobile",mobile);
                intentobj.putExtra("mypassword",password);
                intentobj.putExtra("myaddress",address);
                intentobj.putExtra("mygender",gender);
                intentobj.putExtra("myrating",UserRatig);
                startActivity(intentobj);

        }

        }
