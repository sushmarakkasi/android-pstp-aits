package com.sush.example.registrationfrom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.sush.example.registrationfrom.databinding.ActivityDetaipsBinding;

public class detaipsActivity extends AppCompatActivity {
  ActivityDetaipsBinding detaipsBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        detaipsBinding= DataBindingUtil.setContentView(this,R.layout.activity_detaips);
        Intent i=getIntent();
        String n=i.getStringExtra("myname");
        String e=i.getStringExtra("myemail");
        String m=i.getStringExtra("mymobile");
        String p=i.getStringExtra("mypassword");
        String a=i.getStringExtra("myaddress");
        String g=i.getStringExtra("mygender");
        String r=i.getStringExtra("myrating");
        detaipsBinding.tvDetails.append(
                "name:"+n+"\n"+
                "email:"+e+"\n"+
                "mobile:"+m+"\n"+
                "password:"+p+"\n"+
                "address:"+a+"\n"+
                "gender:"+g+"\n"+
                "rating:"+r+"\n");

    }
}