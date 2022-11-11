package com.example.app_amanigharbi;



import android.content.Intent;
import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;

import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class SignIn2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_2);
        TextView forgot_pwd = findViewById(R.id.forgot_pwd);
        SpannableString content =new SpannableString(forgot_pwd.getText());
        content.setSpan(new UnderlineSpan(),0,content.length(),0);
        forgot_pwd.setText(content);
        String TAG = "yourLogCatTag";
        forgot_pwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewIn) {
                try {
                    Intent intent = new Intent(SignIn2Activity.this,SignIn3Activity.class);
                    startActivity(intent);
                } catch (Exception except) {
                    Log.e(TAG,"there is a problem "+except.getMessage());
                }
            }
        });
    }
}