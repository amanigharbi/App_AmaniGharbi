package com.example.app_amanigharbi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class AddProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_profile);
        AppCompatButton btn = findViewById(R.id.btn_next);
        btn.setOnClickListener(new View.OnClickListener() {
            String TAG = "yourLogCatTag";
            @Override
            public void onClick(View view)
            {
                try {
                    Intent intent = new Intent(AddProfileActivity.this,ConfirmProfileActivity.class);
                    startActivity(intent);
                } catch (Exception except) {
                    Log.e(TAG,"there is a problem "+except.getMessage());
                }
            }
        });
    }
}