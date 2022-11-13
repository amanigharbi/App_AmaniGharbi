package com.example.app_amanigharbi;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;


public class CongratsWizardEnd2Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congrats_wizard_end2);
        AppCompatButton btn = findViewById(R.id.btn1_go);
        btn.setOnClickListener(new View.OnClickListener() {
            String TAG = "yourLogCatTag";
            @Override
            public void onClick(View view)
            {
                try {
                    //Intent intent = new Intent(CongratsWizardEnd2Activity.this,ChildListActivity.class);
                    Intent intent = new Intent(CongratsWizardEnd2Activity.this,ChildDashboardActivity.class);

                    startActivity(intent);
                } catch (Exception except) {
                    Log.e(TAG,"there is a problem "+except.getMessage());
                }
            }
        });
    }
}