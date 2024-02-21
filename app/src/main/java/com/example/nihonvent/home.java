package com.example.nihonvent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);



















        //////////////////////////bottommm///////////////

        BottomNavigationView bottomNavigationView=findViewById(R.id.bottomNavigationView);
        // Set Home selected
        bottomNavigationView.setSelectedItemId(R.id.homeButton);
        // Perform item selected listener
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();
                if(itemId == R.id.eventButton){
                    startActivity(new Intent(getApplicationContext(), EventList.class));
                    overridePendingTransition(0,0);
                    return true;
                } else if (itemId == R.id.homeButton) {
                    return true;
                } else if (itemId == R.id.ticketButton) {
                    startActivity(new Intent(getApplicationContext(), TicketPage.class));
                    overridePendingTransition(0,0);
                    return true;
                }return false;
            }
        });

        ////////////////////////////
    }
}