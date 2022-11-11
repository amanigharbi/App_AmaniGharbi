package com.example.app_amanigharbi;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
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

        String TAG = "yourLogCatTag";
        no_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewIn) {
                try {
                    Intent intent = new Intent(SignIn1Activity.this,SignIn2Activity.class);
                    startActivity(intent);
                } catch (Exception except) {
                    Log.e(TAG,"there is a problem "+except.getMessage());
                }
            }
        });
    }
}