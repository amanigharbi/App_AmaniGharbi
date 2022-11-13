package com.example.app_amanigharbi;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import androidx.appcompat.widget.AppCompatButton;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.app_amanigharbi.databinding.ActivityCongratsWizardEndBinding;

public class CongratsWizardEndActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congrats_wizard_end);
        AppCompatButton btn = findViewById(R.id.btn2_confirm);
        btn.setOnClickListener(new View.OnClickListener() {
            String TAG = "yourLogCatTag";
            @Override
            public void onClick(View view)
            {
                try {
                    Intent intent = new Intent(CongratsWizardEndActivity.this,CongratsWizardEnd2Activity.class);
                    startActivity(intent);
                } catch (Exception except) {
                    Log.e(TAG,"there is a problem "+except.getMessage());
                }
            }
        });
    }
}