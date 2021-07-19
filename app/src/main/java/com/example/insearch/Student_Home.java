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

public class Student_Home extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
private DrawerLayout drawerLayout;
NavigationView navigationView;
//Toolbar toolbar;
    ActionBarDrawerToggle toggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_home);

       drawerLayout=findViewById(R.id.drawer_layout);
       navigationView=findViewById(R.id.navigation_view);


        setNavigationViewListener();

        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navopen,R.string.navclose);
       drawerLayout.addDrawerListener(toggle);
       toggle.syncState();
    }
    @Override
    public void onBackPressed(){
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
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
        if(id==R.id.m1) {

            Intent intent = new Intent(Student_Home.this, Stud_profile.class);
            startActivity(intent);
            return true;
        }
        if(id==R.id.m2) {

            Toast.makeText(Student_Home.this,"feedback",Toast.LENGTH_LONG).show();
            return true;
        }
        else if(id==R.id.m3) {

//            Toast.makeText(Company_Home.this,"DprofileS",Toast.LENGTH_LONG).show();
//            return true;
            Intent intent = new Intent(Student_Home.this, StudentLogin.class);
            startActivity(intent);
            return true;
        }drawerLayout.closeDrawer(GravityCompat.START);return false;

    }
}