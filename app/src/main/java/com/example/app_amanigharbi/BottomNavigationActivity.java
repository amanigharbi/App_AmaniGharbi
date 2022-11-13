package com.example.app_amanigharbi;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.google.android.material.bottomnavigation.BottomNavigationView;

//import com.example.app_amanigharbi.databinding.ActivityBottomNavigationBinding;

public class BottomNavigationActivity extends AppCompatActivity  implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;

  //  private ActivityBottomNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

      //  binding = ActivityBottomNavigationBinding.inflate(getLayoutInflater());
       // setContentView(binding.getRoot());

        //BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        //AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
          //      R.id.navigation_dashboard, R.id.navigation_phone, R.id.navigation_social,R.id.navigation_alert)
            //    .build();
       // NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_bottom_navigation);
        //NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        //NavigationUI.setupWithNavController(binding.navView, navController);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.navigation_dashboard);

    }
    First2Fragment firstFragment = new First2Fragment();
    Second2Fragment secondFragment = new Second2Fragment();
    First3Fragment thirdFragment = new First3Fragment();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.navigation_dashboard:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, firstFragment).commit();
                return true;

            case R.id.navigation_phone:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, secondFragment).commit();
                return true;

            case R.id.navigation_social:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, thirdFragment).commit();
                return true;
        }
        return false;

   }

}