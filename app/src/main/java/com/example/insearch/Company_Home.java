package com.example.insearch;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class Company_Home extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
   private DrawerLayout drawer;
    NavigationView navigationView;
//    Toolbar tool;
   ActionBarDrawerToggle toggle;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company__home);

        androidx.appcompat.widget.Toolbar tool = findViewById(R.id.tool);
        setSupportActionBar(tool);

        drawer = findViewById(R.id.drawer);

        setNavigationViewListener();
        navigationView = findViewById(R.id.navigation_view);



        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, tool, R.string.navigation_open, R.string.navigation_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    @Override
    public void onBackPressed(){
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }

    private void setNavigationViewListener() {
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
         if(id==R.id.profile) {

             Intent intent = new Intent(Company_Home.this,Comp_profile.class);
             startActivity(intent);
             return true;
        }

         else if(id==R.id.intern) {
             Intent intent = new Intent(Company_Home.this,Internship.class);
         startActivity(intent);
         return true;
        }
        else if(id==R.id.application) {

            Toast.makeText(Company_Home.this,"View application",Toast.LENGTH_LONG).show();
            return true;
        }
        else if(id==R.id.logout) {

//            Toast.makeText(Company_Home.this,"DprofileS",Toast.LENGTH_LONG).show();
//            return true;
             Intent intent = new Intent(Company_Home.this, CompanyLogin.class);
          startActivity(intent);
          return true;
        }
        drawer.closeDrawer(GravityCompat.START);return false;

    }
}


