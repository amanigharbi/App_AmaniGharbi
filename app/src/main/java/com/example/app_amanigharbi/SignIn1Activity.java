package com.example.app_amanigharbi;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


public class SignIn1Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_1);
        TextView no_account = findViewById(R.id.no_account);
        SpannableString content =new SpannableString(no_account.getText());
        content.setSpan(new UnderlineSpan(),0,content.length(),0);
        no_account.setText(content);

    }
}